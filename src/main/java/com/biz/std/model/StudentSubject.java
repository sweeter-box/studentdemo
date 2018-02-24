package com.biz.std.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午8:44:29   
* Description:  
*
*@param     
*/

@Entity
@Table(name = "student_subject")
public class StudentSubject implements Serializable{

	private static final long serialVersionUID = -2070788145439779296L;

    @Id
    @GeneratedValue()
    @Column(name = "student_subject_id",unique = true, nullable = false)
    private Integer id;   
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    @Column(name = "subject_id",length=25, nullable = false)
	private String subjectId;
    @Column(name = "score", nullable = false)
   	private Double score;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	



}
