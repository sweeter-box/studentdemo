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

import com.biz.std.model.Grade;
import com.biz.std.model.Student;
import com.biz.std.service.GradeService;
import com.biz.std.vo.GradeVo;
import com.biz.std.vo.StudentVo;

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
public class GradeController {
	
	@Autowired
	private GradeService gradeService;
	@RequestMapping("/savegrade")
	public @ResponseBody Grade save() {
	  Grade garde =new Grade();
		
	
		return gradeService.save(garde);
	}

	@DeleteMapping(value="/deletegrade/{id}")
	public void delete(@PathVariable Integer id) {
		gradeService.delete(id);
	}

	
	@PatchMapping("")
	public Boolean update( @RequestBody Student student) {
		return null;//gradeService.update(student);
	}

	@GetMapping("/getOneGrade/{id}")
	@ResponseBody
	public Grade getStudentOne(@PathVariable String id) {
		Grade grade = gradeService.findOne(Integer.valueOf(id));
		
		return grade;
	}
	@GetMapping("/getAllGrade")	
	public ModelAndView  getGradeAll() {
		ModelAndView mav =new ModelAndView("gradeinfo");
		List<GradeVo> voList= new LinkedList<>();
		List<Grade> gradelist = gradeService.findAll();
		for(Grade grade:gradelist) {
			String gradeName=grade.getGradeName();
			String id =grade.getGradeId();
			GradeVo gradeVo =new GradeVo(gradeName, gradeService.getGradeStudentNum(id), gradeService.getGradeAvgScore(id));
			voList.add(gradeVo);
		}
		mav.addObject("gradelist", voList);
		return mav;
	}

	@GetMapping("/findGradeByName")
	public List<StudentVo> findByNameLike(@RequestParam("nameKeyword") String name) {
		
	
		return null;
	}

}
