package org.kframe.mybatis.service;

import javax.annotation.Resource;

import org.kframe.mybatis.dao.UserdetailDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserdetailService implements IUserdetailService {

	
	@Resource
	private UserdetailDao dao;
	
	@Transactional(readOnly = true)
	@Override
	public Object query() {
		// TODO Auto-generated method stub
		return dao.query();
	}

	@Transactional(readOnly = true)
	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

}
