package com.biz.std.vo;
/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午12:59:14   
* Description:  
*
*@param     
*/

public class GradeVo {
	//班级名
	private String gradeName;
	//班级人数
	private Integer studentNum;
	//平均分
	private Double avgScore;
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Integer getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(Integer studentNum) {
		this.studentNum = studentNum;
	}
	public Double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}
	public GradeVo(String gradeName, Integer studentNum, Double avgScore) {
		super();
		this.gradeName = gradeName;
		this.studentNum = studentNum;
		this.avgScore = avgScore;
	}
	public GradeVo() {
		super();
	}
	

}
