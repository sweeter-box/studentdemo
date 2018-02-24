package com.biz.std.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.biz.std.model.Student;
import com.biz.std.repository.StudentRepository;
import com.biz.std.service.StudentService;
import com.biz.std.util.Sex;
import com.biz.std.vo.StudentVo;


/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午11:18:52   
* Description:  
*
*@param     
*/

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	@Autowired
	StudentRepository StudentRepository;
	@RequestMapping("/saveStudent")
	public @ResponseBody Boolean save() {
		Student studentinfo=new Student();
		
		studentinfo.setId(1);
		studentinfo.setImg("/");
		studentinfo.setSex(true);
		studentinfo.setName("张三");
		studentinfo.setDatePicker(new Date());
		return service.save(studentinfo);
	}

	@DeleteMapping(value="/deleteStudent/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

	
	@PatchMapping("/student/{id}")
	public Boolean update( @RequestBody Student student) {
		return service.update(student);
	}

	@GetMapping("/getOneStudent/{id}")
	@ResponseBody
	public StudentVo getStudentOne(@PathVariable String id) {
		Student student = service.findOne(Integer.valueOf(id));
		StudentVo studentVo = new StudentVo();
		BeanUtils.copyProperties(student, studentVo);
		System.out.println(studentVo);
		return studentVo;
	}
	@GetMapping("/getAllStudent")	
	public ModelAndView  getStudentAll() {
		ModelAndView mav =new ModelAndView("studentinfo");
		List<StudentVo> voList= new LinkedList<>();
		List<Student> studentlist = service.findAll();
		for(Student student:studentlist) {
			Integer id =student.getId();
			StudentVo std=new StudentVo();
			BeanUtils.copyProperties(student, std);
			if(student.getSex()) {			
				std.setSex(Sex.getName(0));
			}else {
				std.setSex(Sex.getName(1));
			}
			std.setGradeName(service.getGradeNameByStudentId(id));
			std.setAvgScore(service.getAvgScore(id));
			std.setCourseNum(service.getChooseCourseNum(id));
			
			voList.add(std);
		}	
		mav.addObject("studentlist", voList);
		return mav;
	}

	@GetMapping("/findStudentByName")
	public List<StudentVo> findByNameLike(@RequestParam("nameKeyword") String name) {
		List<Student> list = service.findByNameLike(name);
		List<StudentVo> voList = new ArrayList<>();

		for (Student dept : list) {
			StudentVo vo = new StudentVo();
			BeanUtils.copyProperties(dept, vo);
			voList.add(vo);
		}
		return voList;
	}
}
