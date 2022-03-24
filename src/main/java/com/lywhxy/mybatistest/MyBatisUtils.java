package com.lywhxy.mybatistest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = 
                    new SqlSessionFactoryBuilder().build(inputStream, "development"); 	   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static SqlSession getSession() {	
		return sqlSessionFactory.openSession();
	}
}
