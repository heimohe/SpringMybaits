package com.springMyBatis.system.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springMyBatis.system.dao.UserDao;
import com.springMyBatis.system.model.User;

public class UserController {
	/**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx=null;
        //1. ���������ļ�applicationContext.xml
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. ������� --����Ҫ�Լ�new�����Ǵ�spring������� ��getBeanʵ����
        UserDao userDao=(UserDao) ctx.getBean("userDao");
        User user=new User();
        //������������
        user.setId(2);
        user.setUsername("Jessica");
        user.setPassword("123");
        userDao.addUser(user);
        user.setId(3);
        user.setUsername("Jessica2");
        user.setPassword("123");
        userDao.addUser(user);
        System.out.println("���ӳɹ�");
        //��ѯ����
        user.setUsername("Jessica");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        user.setUsername("Jessica2");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        //�޸�����
        user.setId(4);
        user.setPassword("802");
        userDao.updateUser(user);
        System.out.println("�޸ĳɹ�");
        //ɾ������
        userDao.deleteUser(1);
        System.out.println("ɾ���ɹ�");
        
    }
}