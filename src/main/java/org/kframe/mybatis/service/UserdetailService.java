package org.kframe.mybatis.service;

import javax.annotation.Resource;

import org.kframe.mybatis.dao.UserdetailDao;
import org.kframe.mybatis.entity.UserDetail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserdetailService implements IUserdetailService {

	
	@Resource
	private UserdetailDao dao;
	
	@Transactional
	@Override
	public Object query() {
		// TODO Auto-generated method stub
		return dao.query();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW ,readOnly = true)
	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public int save(UserDetail detail) {
		// TODO Auto-generated method stub
		return dao.save(detail);
	}
	
}
