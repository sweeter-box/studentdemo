package com.biz.std.vo;
/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月23日 上午1:02:36   
* Description:  
*
*@param     
*/

public class SubjectVo {
	//课程名
	private String subjectName;
	//选修人数
	private Integer chooseNum;
	//平均分
	private Double avgScore;
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getChooseNum() {
		return chooseNum;
	}
	public void setChooseNum(Integer chooseNum) {
		this.chooseNum = chooseNum;
	}
	public Double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}


}
