package com.biz.std.repository;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.biz.std.model.Student;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午10:25:51   
* Description:  
*
*@param     
*/
//@Component
//@RepositoryDefinition(domainClass = Student.class, idClass = Integer.class)
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
/*	//Student save(Student student);
	void delete(Integer id);
  
    void delete(Student student);
    
   // Student findOne(Integer id);

    List<Student> findAll();
    
    boolean exists(Integer id);

	List<Student> findByNameLike(String string);
	
*/
	// @Query("SELECT s.*, ss.avg AS courseNum,ss.count AS avgScore FROM student_info s  LEFT OUTER JOIN (SELECT  AVG(ss.score) AS AVG,COUNT(*) AS COUNT,ss.student_id FROM student_subject ss GROUP BY ss.student_id) ss ON ss.student_id=s.student_id")
	// List<Object> findStudentAllInfo();
	
	/**
	 * 查学生所有科目的平均分
	 * @param StidentId
	 * @return
	 */
	@Query(value="SELECT  AVG(ss.score) FROM student_subject ss where ss.student_id=?",nativeQuery = true)
	public Double getAvgScore(Integer StidentId);
	
	/**
	 * 查选择的科目数
	 * @param StidentId
	 * @return
	 */
	@Query(value="SELECT COUNT(*) FROM student_subject ss where ss.student_id=?",nativeQuery = true)
	public Integer getChooseCourseNum(Integer StidentId);
	
	/**
	 * 返回学生班级名
	 * @param studentId
	 * @return
	 */
	 @Query(value="SELECT g.grade_name FROM grade_info g,student_info s WHERE s.grade_id=g.grade_id AND s.student_id=?",nativeQuery=true)
	public String getGradeNameByStudentId(Integer studentId);
}
