package com.biz.std.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午1:02:36   
* Description:  
*
*@param     
*/

@Entity
@Table(name = "subject_info")
public class Subject implements Serializable{
	
	private static final long serialVersionUID = 8094252195729280694L;
	@Id
	@GeneratedValue()
	@Column(name = "subject_id",unique = true, nullable = false)
	private String subjectId;
	@Column(name = "subject_name",length=25, nullable = false)
	private String subjectName;
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Subject() {
		super();
	}
	public Subject(String subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}
	
	

}
