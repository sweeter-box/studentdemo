package com.biz.std.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.std.model.Subject;
import com.biz.std.repository.SubjectRepository;
import com.biz.std.service.SubjectService;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午1:21:42   
* Description:  
*
*@param     
*/
@Service
public class SubjectServiceImpl  implements SubjectService{
	@Autowired
	SubjectRepository subjectRepository;
	@Override
	public Boolean save(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean update(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> findAll() {		
		return subjectRepository.findAll();
	}

	@Override
	public Integer getChooseNumByid(String subjectId) {
	
		return subjectRepository.getChooseNumByid(subjectId);
	}

	@Override
	public Double getSubjectAvgScore(String subjectId) {
		return subjectRepository.getSubjectAvgScore(subjectId);
	}

}
