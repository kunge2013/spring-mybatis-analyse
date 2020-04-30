package org.kframe.mybatis;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Component;

@Component
@MapperScan(basePackages = {"org.kframe.mybatis.dao"})
public class MybatisConfig {

	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
	  SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
	  factoryBean.setDataSource(dataSource());
	  return factoryBean.getObject();
	}

	@Bean
	private DataSource dataSource() {
		SimpleDriverDataSource datasource = new SimpleDriverDataSource();
		datasource.setDriverClass(com.mysql.jdbc.Driver.class);
		datasource.setUrl("jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong");
		datasource.setUsername("fk");
		datasource.setPassword("123456");
		
		return datasource;
	}
	
	public static void main(String[] args) throws SQLException {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong");
		datasource.setUsername("fk");
		datasource.setPassword("123456");
		datasource.getConnection();
	}
}
