package com.biz.std.repository;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.biz.std.model.Student;
import com.biz.std.service.impl.StudentServiceImpl;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 下午3:15:59   
* Description:  
*
*@param     
*/

public class RepositoryTest {
	
	@Autowired
	StudentServiceImpl ssi;
	@Autowired
	StudentRepository sr;
		@Test
      public  void test1(){
    		Student studentinfo=new Student();
    		studentinfo.setId(1);
    		studentinfo.setImg("/");
    		studentinfo.setSex(true);
    		studentinfo.setName("peter");
    		studentinfo.setDatePicker(new Date());
    	   ssi.save(studentinfo);
       }
		@Test
		public void test2() {
			Student studentinfo=new Student();
    		studentinfo.setId(1);
    		studentinfo.setImg("/");
    		studentinfo.setSex(true);
    		studentinfo.setName("peter");
    		studentinfo.setDatePicker(new Date());
			sr.save(studentinfo);
		}
}
