package com.biz.std.vo;


import java.util.Date;

import com.biz.std.util.Sex;


/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月22日 下午8:44:29   
* Description:  
*
*@param     
*/

public class StudentVo {
	
	//
    private Integer id;
    private String name;
    private String sex;
    private Date datePicker;
    //头像
    private String img;
    //班级
    private String gradeName;
    //所选科目数
    private Integer courseNum;
    //平均分
    private Double avgScore;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDatePicker() {
		return datePicker;
	}
	public void setDatePicker(Date datePicker) {
		this.datePicker = datePicker;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Integer getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(Integer courseNum) {
		this.courseNum = courseNum;
	}
	public Double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}
    
	

    
}
