package com.biz.std.repository;



import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.std.service.StudentService;


public class EmployeeCrudRepositoryTest {


	//上下文对象
    private ApplicationContext ctx = null;
    //继承了repository的接口EmployeeRepository
    private StudentService categoryServiceImpl = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("spring/spring-jpa.xml");
        categoryServiceImpl = ctx.getBean("categoryServiceImpl",StudentService.class);
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }
    @Test
    public void testSave(){
    	  	
    	
    	
              
    

    }

}
