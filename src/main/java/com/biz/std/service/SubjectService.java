package com.biz.std.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.biz.std.model.Subject;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午1:21:10   
* Description:  
*
*@param     
*/

public interface SubjectService {

	Boolean save(Subject subject);
	
	void delete(Integer id);
	
	void delete(Subject subject);

	Boolean update(Subject subject);

	Subject findOne(Integer id);
	List<Subject> findAll();
	Integer getChooseNumByid(String subjectId);
	Double getSubjectAvgScore(String subjectId);
	

}
