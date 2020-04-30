package org.kframe.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MysqlDbDao {

	@Select("select host, user from db")
	public List<Map<String,Object>> list();
	
}
