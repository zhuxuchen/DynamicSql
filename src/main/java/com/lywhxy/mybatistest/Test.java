package com.lywhxy.mybatistest;

import com.lywhxy.mapper.CustomerMapper;
import com.lywhxy.pojo.Customer;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
	public static void selectCustomer(){
		Customer customer = new Customer();
		//customer.setCust_name("张");
		customer.setCust_level("22");
		//customer.setCust_source("6");
		//获取session
		SqlSession sqlSession = MyBatisUtils.getSession();
		//获取Mapper对象
		CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
		//调用查询
		System.out.println(customerMapper.selectCustomers(customer));
		sqlSession.close();
	}

	public static void main(String[] args) throws IOException {
		selectCustomer();
	}
}
