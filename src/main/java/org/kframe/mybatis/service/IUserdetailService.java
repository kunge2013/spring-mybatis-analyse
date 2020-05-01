package org.kframe.mybatis.service;

import org.kframe.mybatis.entity.UserDetail;

public interface IUserdetailService {

	public Object query();
	
	public int delete(int id);
	
	public int save(UserDetail detail);
}
