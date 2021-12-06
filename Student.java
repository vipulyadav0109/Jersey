package com.DEMO.demorest;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
   private	int STUDENT_NO;
   private String STUDENT_NAME;
   private Date STUDENT_DOB;
   private Date STUDENT_DOJ;
   
	/*
	 * private int PRJ_NO; private String PRJ_NAME; private int PRJ_DUR; private
	 * String PRJ_PLATFORM;
	 */
   
   
public int getSTUDENT_NO() {
	return STUDENT_NO;
}
public void setSTUDENT_NO(int sTUDENT_NO) {
	STUDENT_NO = sTUDENT_NO;
}
public String getSTUDENT_NAME() {
	return STUDENT_NAME;
}
public void setSTUDENT_NAME(String sTUDENT_NAME) {
	STUDENT_NAME = sTUDENT_NAME;
}
public Date getSTUDENT_DOB() {
	return STUDENT_DOB;
}
public void setSTUDENT_DOB(Date sTUDENT_DOB) {
	STUDENT_DOB = sTUDENT_DOB;
}
public Date getSTUDENT_DOJ() {
	return STUDENT_DOJ;
}
public void setSTUDENT_DOJ(Date sTUDENT_DOJ) {
	STUDENT_DOJ = sTUDENT_DOJ;
}
   
   
/*
 * public int getPRJ_NO() { return PRJ_NO; } public void setPRJ_NO(int pRJ_NO) {
 * PRJ_NO = pRJ_NO; } public String getPRJ_NAME() { return PRJ_NAME; } public
 * void setPRJ_NAME(String pRJ_NAME) { PRJ_NAME = pRJ_NAME; } public int
 * getPRJ_DUR() { return PRJ_DUR; } public void setPRJ_DUR(int pRJ_DUR) {
 * PRJ_DUR = pRJ_DUR; } public String getPRJ_PLATFORM() { return PRJ_PLATFORM; }
 * public void setPRJ_PLATFORM(String pRJ_PLATFORM) { PRJ_PLATFORM =
 * pRJ_PLATFORM; }
 * 
 * 
 */ 
 }
 