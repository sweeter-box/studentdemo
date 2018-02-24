package com.biz.std.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.biz.std.model.Subject;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午10:25:51   
* Description:  
*
*@param     
*/

//@RepositoryDefinition(domainClass = Subject.class, idClass = String.class)
public interface SubjectRepository extends JpaRepository<Subject, String>{
	/**
	 * 返回选修课程的人数
	 * @param subjectId
	 * @return
	 */
	@Query(value="select count(*) from student_subject ss,subject_info s where ss.subject_id=s.subject_id and s.subject_id=?",nativeQuery=true)
	public Integer getChooseNumByid(String subjectId);
	
	/**
	 * 返回课程平均分
	 * @param subjectId
	 * @return
	 */
	@Query(value="select avg(ss.score) from student_subject ss,subject_info s where s.subject_id=ss.subject_id and s.subject_id=?",nativeQuery=true)
	public Double getSubjectAvgScore(String subjectId);
}
