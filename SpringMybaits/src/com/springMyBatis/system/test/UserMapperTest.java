package com.springMyBatis.system.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springMyBatis.system.dao.UserDao;
import com.springMyBatis.system.model.User;

public class UserMapperTest {
	private ApplicationContext context;  
	  
    @Before  
    public void setUp() throws Exception {  
        context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");  
    }  
  
    @Test  
    public void testFindUserById() throws Exception {  
          
        //获取代理对象  
    	UserDao userDao = (UserDao) context.getBean("userDao");  
    	User user=new User();  
    	user.setUsername("Jessica");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        
          
        System.out.println(user);  
          
          
    }  
}
