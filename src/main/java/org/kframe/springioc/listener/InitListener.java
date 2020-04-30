package org.kframe.springioc.listener;

import org.springframework.context.ApplicationListener;

public class InitListener implements ApplicationListener<InitApplicationEvent>{

	@Override
	public void onApplicationEvent(InitApplicationEvent event) {
		System.out.println(event.toString());
	}

}
