package com.biz.std.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biz.std.model.Grade;
import com.biz.std.model.Student;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午10:53:31   
* Description:  
*
*@param     
*/

public interface StudentService {

	Boolean save(Student student);
	
	void delete(Integer id);
	
	void delete(Student student);

	Boolean update(Student student);

	Student findOne(Integer id);
	List<Student> findAll();
	List<Student> findByNameLike(String name);
	List<Object> findStudentAllInfo();
	
	Double getAvgScore(Integer StidentId);
	Integer getChooseCourseNum(Integer StidentId);
	String getGradeNameByStudentId(Integer studentId);

}
