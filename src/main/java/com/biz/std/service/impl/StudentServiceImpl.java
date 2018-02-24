package com.biz.std.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.biz.std.model.Grade;
import com.biz.std.model.Student;
import com.biz.std.repository.StudentRepository;
import com.biz.std.service.StudentService;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午10:57:01   
* Description:  
*
*@param     
*/
@Service
public class StudentServiceImpl implements StudentService{
	 @Autowired
	StudentRepository repository;
	@Override
	public Boolean save(Student student) {
		student = repository.save(student);
		System.out.println(student);
        return !ObjectUtils.isEmpty(student) && !StringUtils.isEmpty(student.getId());
	}

	@Override
	public void delete(Integer id) {
	
		 repository.delete(id);
	}

	@Override
	public void delete(Student student) {
	
		 repository.delete(student);
	}

	@Override
	public Boolean update(Student student) {
		Assert.notNull(student.getId(), "学号号不能为空.");

		Student tempStudent = findOne(student.getId());
		Assert.notNull(tempStudent, "学生信息不存在.修改失败..");

		BeanUtils.copyProperties(student, tempStudent);

		student = repository.save(student);
		return !ObjectUtils.isEmpty(student) && !StringUtils.isEmpty(student.getId());
	}

	@Override
	public Student findOne(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public List<Student> findByNameLike(String name) {
		 return null; //repository.findByNameLike("%" + name + "%");
	}


	@Override
	public List<Student> findAll() {
		
		return repository.findAll();
	}

	@Override
	public List<Object> findStudentAllInfo() {
		
		return null;
	}

	@Override
	public Double getAvgScore(Integer StidentId) {
		
		return repository.getAvgScore(StidentId);
	}

	@Override
	public Integer getChooseCourseNum(Integer StidentId) {
		
		return repository.getChooseCourseNum(StidentId);
	}

	@Override
	public String getGradeNameByStudentId(Integer studentId) {
	
		return repository.getGradeNameByStudentId(studentId);
	}


}
