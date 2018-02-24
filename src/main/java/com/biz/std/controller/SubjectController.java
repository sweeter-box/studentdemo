package com.biz.std.controller;

import java.util.LinkedList;
import java.util.List;

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
import com.biz.std.model.Subject;
import com.biz.std.service.SubjectService;
import com.biz.std.vo.SubjectVo;


/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月24日 下午2:21:27   
* Description:  
*
*@param     
*/
@Controller
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	@RequestMapping("/saveSubject")
	public @ResponseBody Boolean save() {
		Subject subject =new Subject();
		
	
		return subjectService.save(subject);
	}

	@DeleteMapping(value="/deleteSubject/{id}")
	public void delete(@PathVariable Integer id) {
		subjectService.delete(id);
	}

	
	@PatchMapping("/update")
	public Boolean update( @RequestBody Student student) {
		return null;//gradeService.update(student);
	}

	@GetMapping("/getOneSubject/{id}")
	@ResponseBody
	public Subject getStudentOne(@PathVariable String id) {
		Subject subject = subjectService.findOne(Integer.valueOf(id));
		
		return subject;
	}
	@GetMapping("/getAllSubject")	
	public ModelAndView  getGradeAll() {
		ModelAndView mav =new ModelAndView("subjectinfo");
		List<SubjectVo> voList= new LinkedList<>();
		List<Subject> subjectlist = subjectService.findAll();
		for(Subject subject:subjectlist) {
			SubjectVo subjectVo =new SubjectVo();
			subjectVo.setSubjectName(subject.getSubjectName());
			String id =subject.getSubjectId();
			subjectVo.setChooseNum(subjectService.getChooseNumByid(id));
			subjectVo.setAvgScore(subjectService.getSubjectAvgScore(id));
			voList.add(subjectVo);
		}
		mav.addObject("subjectlist", voList);
		return mav;
	}


}
