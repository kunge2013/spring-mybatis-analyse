package org.kframe.springioc.service;

public class DbService implements IDbService {

	private AutowireObject autowireObject;
	
	
	public AutowireObject getAutowireObject() {
		return autowireObject;
	}

	public void setAutowireObject(AutowireObject autowireObject) {
		this.autowireObject = autowireObject;
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void save() {
		System.out.println("save method ......" + this.name);
	}
	
}
