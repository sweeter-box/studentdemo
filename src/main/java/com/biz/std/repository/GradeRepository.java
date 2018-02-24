package com.biz.std.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.biz.std.model.Grade;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午10:25:51   
* Description:  
*
*@param     
*/


public interface GradeRepository extends JpaRepository<Grade, String>{
	/**
	 * 根据班级id,返回班级人数
	 * @param gradeId
	 * @return
	 */
	@Query(nativeQuery=true,value="select count(*) from student_info s where s.grade_id=?")
	public Integer getGradeStudentNum(String gradeId);
	
	/**
	 * 返回班级平均分 总分/人数
	 * @param gradeId
	 * @return
	 */
	@Query(nativeQuery=true,value="select sum(ss.score)/(select count(*) from student_info si where si.grade_id=s.grade_id) from student_subject ss,student_info s where ss.student_id=s.student_id and s.grade_id=?")
	public Double getGradeAvgScore(String gradeId);
}
