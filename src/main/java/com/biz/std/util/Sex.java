package com.biz.std.util;
/**   
* @version 1.0   
* @author TianMengJun
* @since JDK 1.8.0_20
* Create at:   2018年2月25日 上午12:08:25   
* Description:  
*
*@param     
*/

public enum Sex {
	MALE("男",0),FENMALE("女",1); 
	private String name;  
    private int index;  
    // 构造方法  
    private Sex(String name, int index) {  
        this.name = name;  
        this.index = index;  
    }  
    // 普通方法  
    public static String getName(int index) {  
        for (Sex s : Sex.values()) {  
            if (s.getIndex() == index) {  
                return s.name;  
            }  
        }  
        return null;  
    }  
    // get set 方法  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getIndex() {  
        return index;  
    }  
    public void setIndex(int index) {  
        this.index = index;  
    } 

}
