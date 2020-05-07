package org.kframe.mybatis;

import org.kframe.mybatis.service.IMysqlService;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MybatisApp {
	private static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		System.out.println("=======================begin  AnnotationConfigApplicationContext=======================================");
		context = new AnnotationConfigApplicationContext("org.kframe.mybatis");
		AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
		
		factory.autowire(MybatisConfig.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		
		IMysqlService service = context.getBean(IMysqlService.class);
//		IUserdetailService service = context.getBean(IUserdetailService.class);
		System.out.println(service.list());
//		System.out.println(service.save(new UserDetail("12045789658")));
	}
}
