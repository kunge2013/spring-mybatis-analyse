package org.kframe.mybatis.service;

import org.kframe.mybatis.dao.MysqlDbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MysqlService implements IMysqlService {

	@Autowired
	private MysqlDbDao dao;

	@Override
	public Object list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
