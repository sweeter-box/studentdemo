package com.biz.std.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biz.std.model.Grade;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午1:20:44   
* Description:  
*
*@param     
*/

public interface GradeService {
	Grade save(Grade grade);
	
	boolean delete(Integer id);	

	Boolean update(Grade grade);

	Grade findOne(Integer id);
	List<Grade> findAll();
	List<Grade> findByNameLike(String name);
	
	public Integer getGradeStudentNum(String gradeId);
	
	public Double getGradeAvgScore(String gradeId);
}
