package org.kframe.mybatis;

import org.kframe.mybatis.service.IMysqlService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MybatisApp {
	private static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		System.out.println("=======================begin  AnnotationConfigApplicationContext=======================================");
		context = new AnnotationConfigApplicationContext("org.kframe.mybatis");
		IMysqlService service = context.getBean(IMysqlService.class);
		System.out.println(service.list());
	}
}
