package org.kframe.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.kframe.mybatis.entity.UserDetail;

public interface UserdetailDao {

	@Select("select id, mobile from userdetail")
	public List<Map<String, String>> query();
	
	@Delete("delete from userdetail where id = id")
	public int delete(int id);
	
	
	@Insert({"insert into userdetail(mobile) values(#{mobile})"})
	public int save(UserDetail userDetail);
	
}
