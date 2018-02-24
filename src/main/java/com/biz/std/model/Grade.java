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
* Create at:   2018年2月23日 上午12:59:14   
* Description:  
*
*@param     
*/

@Entity
@Table(name = "grade_info")
public class Grade implements Serializable{
	
	private static final long serialVersionUID = 6207913227231073119L;
	@Id
	@GeneratedValue()
	@Column(name = "grade_id",length=25,unique = true, nullable = false)
	private String gradeId;
	@Column(name = "grade_name",length=25)
	private String gradeName;
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	public Grade() {
		super();
	}
	public Grade(String gradeId, String gradeName) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
	}
	

	
	
}
