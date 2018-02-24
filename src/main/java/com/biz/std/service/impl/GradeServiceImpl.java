package com.biz.std.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biz.std.model.Grade;
import com.biz.std.repository.GradeRepository;
import com.biz.std.service.GradeService;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午1:22:09   
* Description:  
*
*@param     
*/
@Service
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	private GradeRepository gradeRepository;
	@Override
	public Grade save(Grade grade) {
		
		return gradeRepository.save(grade);
	}

	@Override
	public boolean delete(Integer id) {
		
		 gradeRepository.delete(String.valueOf(id));
		return true;
	}

	
	

	@Override
	public Boolean update(Grade grade) {
		
		return null;
	}

	@Override
	public Grade findOne(Integer id) {
		return null;
	}

	@Override
	public List<Grade> findAll() {
		List<Grade> gradelist=gradeRepository.findAll();
		return gradelist;
	}

	@Override
	public List<Grade> findByNameLike(String name) {
		return null;
	}

	@Override
	public Integer getGradeStudentNum(String gradeId) {

		return gradeRepository.getGradeStudentNum(gradeId);
	}

	@Override
	public Double getGradeAvgScore(String gradeId) {
	
		return gradeRepository.getGradeAvgScore(gradeId);
	}

}
