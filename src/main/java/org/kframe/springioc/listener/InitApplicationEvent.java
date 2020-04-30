package org.kframe.springioc.listener;

import org.springframework.context.ApplicationEvent;

public class InitApplicationEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2329234084586098871L;
	
	private String eventName = this.getClass().getName();
	
	public InitApplicationEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "InitApplicationEvent [eventName=" + eventName + "]";
	}

	

}
