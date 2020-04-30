package org.kframe.springioc.annotations.processor;

import org.kframe.springioc.annotations.Config;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class InitBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" postProcessBeforeInitialization ===" + beanName);
		if (beanName.equalsIgnoreCase("config")) {
			Config conf =  (Config) bean;
			conf.setName("这是被修改后的名称!!!!!!!!!!");
			return conf;
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" postProcessAfterInitialization ===" + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
	
}
