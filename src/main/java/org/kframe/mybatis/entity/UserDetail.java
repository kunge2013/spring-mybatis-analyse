package org.kframe.mybatis.entity;

public class UserDetail {
	
	private int id;
	
	private String mobile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public UserDetail(String mobile) {
		super();
		this.mobile = mobile;
	}
	
	
	
	
	
}
