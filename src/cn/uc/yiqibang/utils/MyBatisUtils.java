package cn.uc.yiqibang.utils;


import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	
	
	 //����ģʽ
	 
	
	private static String resource = "config.xml";
	private static SqlSessionFactory factory =null;
	
	
	 //���巽������ȡӦ��Ψһ��factory����
	
	
	
	public static SqlSessionFactory getFactory(){
		if(factory == null){			
			InputStream is = MyBatisUtils.class.getClassLoader().getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(is);
		}
		return factory;
	}
	
	
	 //ͨ�����÷���getFactory��һ��SqlSession�Ự����
	
    public static SqlSession openSession(){
		return getFactory().openSession();
	}
}
