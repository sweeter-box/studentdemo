package com.biz.std.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "student_info")
public class Student implements Serializable{

	private static final long serialVersionUID = -2070788145439779296L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id",unique = true, nullable = false)
    private Integer id;
    @Column(name = "student_name",length=10,unique = true, nullable = false)
    private String name;
    @Column(name="student_img",length=25)
    private String img;
    @Column(length=2,nullable = false)
    private Boolean sex;
    @Column
    private Date datePicker;
    @Column(name = "grade_id",length=25)
	private String gradeId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Date getDatePicker() {
		return datePicker;
	}
	public void setDatePicker(Date datePicker) {
		this.datePicker = datePicker;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	
	public Student() {
		super();
	}
	public Student(Integer id, String name, String img, Boolean sex, Date datePicker, String gradeId) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.sex = sex;
		this.datePicker = datePicker;
		this.gradeId = gradeId;
	}
	



}
