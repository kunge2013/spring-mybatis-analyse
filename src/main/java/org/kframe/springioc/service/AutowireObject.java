package org.kframe.springioc.service;

public class AutowireObject {
	
	public IDbService getDbService() {
		return dbService;
	}

	public void setDbService(IDbService dbService) {
		this.dbService = dbService;
	}

	private IDbService dbService;
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
