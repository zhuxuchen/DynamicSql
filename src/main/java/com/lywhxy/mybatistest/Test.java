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

	public static void updateCustomer(){
		Customer customer = new Customer();
		customer.setCust_id(26);
		customer.setCust_name("小杰");
		customer.setCust_mobile("123456789");
		//获取session
		SqlSession sqlSession = MyBatisUtils.getSession();
		//获取Mapper对象
		CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
		//调用查询
		System.out.println(customerMapper.updateCustomer(customer));
		//更新操作需要commit
		sqlSession.commit();
		sqlSession.close();
	}
	public static void main(String[] args) throws IOException {
		//selectCustomer();
		updateCustomer();
	}
}
