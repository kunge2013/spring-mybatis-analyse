package org.kframe.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface UserdetailDao {

	@Select("select id, mobile from userdetail")
	public List<Map<String, String>> query();
	
	@Delete("delete from userdetail where id = id")
	public int delete(int id);
	
}
