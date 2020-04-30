package org.kframe.springioc.annotations.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
@Aspect
@EnableAspectJAutoProxy//启用切面
public class LoggingAspect {

	/*
	 * 定义一个方法，用于声明切入点的表达式，一般地，该方法中不需要添加其他代码 使用@Pointcut来声明切入点表达式
	 * 后面的其他通知直接使用方法名来引用切入点表达式
	 */
	@Pointcut("execution(int org.kframe.springioc.annotations.aop.ArithmeticCalculator.*(..))")
	public void declareJoinPointExpression() {
		System.out.println("declareJoinPointExpression");
	};

	/*
	 * 在top.cheungchingyin.spring.aop. ArithmeticCalculator接口的每一个实现类的每一个方法开始之前执行一段代码
	 */
	@Before("declareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("The Method " + methodName + " Begins with " + Arrays.asList(args));
	}

	/*
	 * 返回通知：在方法执行后执行的代码，无论方法是否发生异常
	 */
	@After("declareJoinPointExpression()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method " + methodName + " ends with");

	}

	/**
	 * 	返回通知:在方法正常结束后执行代码 返回通知是可以访问到方法的返回值
	 * 
	 * @param joinPoint
	 */
	@AfterReturning(value = "declareJoinPointExpression()", returning = "result")
	public void afterReturningMethod(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method " + methodName + " ends with " + result);

	}

	/**
	 * 在方法出现异常的时候会执行代码 可以访问到的异常对象，且可以指定出现特定异常的时候才执行通知代码
	 * 
	 * @param joinPoint
	 * @param ex
	 */
	@AfterThrowing(value = "declareJoinPointExpression()", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method " + methodName + " occurs with " + ex);

	}

	/**
	 * 环绕通知需要携带ProceedingJoinPoint类型参数
	 * 环绕通知类似于动态代理的全过程，ProceedingJoinPoint类型的参数可以决定是否执行目标方法
	 * 且环绕通知必须要有返回值，返回值即为目标方法的返回值
	 * 
	 * @param pjd
	 * @return
	 */
	@Around("declareJoinPointExpression()")
	public Object arroundMethod(ProceedingJoinPoint pjd) {
		Object result = null;
		String methodName = pjd.getSignature().getName();
		// 执行目标方法
		try {
			// 前置通知
			System.out.println("【Around】The method 【" + methodName + "】 begins with" + Arrays.asList(pjd.getArgs()));
			result = pjd.proceed();
			// 后置通知
			System.out.println("【Around】The Method " + " ends with 【" + result + "】");
		} catch (Throwable e) {
			// 异常通知
			System.out.println("The method occurs exception" + e);
		}
		// 后置通知
		System.out.println("【Around】The Method 【" + methodName + "】 ends ");
		return result;
	}
}
