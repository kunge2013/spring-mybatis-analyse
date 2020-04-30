package org.kframe.springioc.annotations;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanInstance  implements FactoryBean<String>{

	@Override
	public String getObject() throws Exception {
		return new String("11") + System.nanoTime();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return String.class;
	}
	
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
