package com.DEMO.demorest;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class StudentDAORepo {

	List<Student> stud;
	Connection con=null;
	  PreparedStatement prp=null;
	  ResultSet rs=null;
	   
	/*
	 * String qry="select *\r\n" +
	 * "from student s inner join STUDENT_PROJECT s_p \r\n" +
	 * "on s.STUDENT_NO=s_p.STUDENT_NO \r\n" + "inner join PROJECT p\r\n" +
	 * "on s_p.PRJ_NO =p.PRJ_NO;";
	 */
      String qry="select * from student";
	
	public StudentDAORepo() {
		stud=new ArrayList<>();
			
	}
		
	public List<Student> getStudent(){
		
		   
		   try{  
			   Class.forName("com.mysql.jdbc.Driver");  
			   con=DriverManager.getConnection(  
			   "jdbc:mysql://localhost:3306/mydb","root","root");  
			   
			   
			   prp=con.prepareStatement(qry);
			 rs=prp.executeQuery();
			  while(rs.next()) {
					Student s = new Student();
						
					s.setSTUDENT_NO(rs.getInt("STUDENT_NO"));
					s.setSTUDENT_NAME(rs.getNString("STUDENT_NAME"));
					s.setSTUDENT_DOB(rs.getDate("STUDENT_DOB"));
					s.setSTUDENT_DOJ(rs.getDate("STUDENT_DOJ"));
					
				/*
				 * s.setPRJ_NO(rs.getInt("PRJ_NO")); s.setPRJ_NAME(rs.getNString("PRJ_NAME"));
				 * s.setPRJ_DUR(rs.getInt("PRJ_DUR"));
				 * s.setPRJ_PLATFORM(rs.getNString("PRJ_PLATFORM"));
				 */
					
					stud.add(s);
								  
			  }
			  rs.close();
			  prp.close();
			  con.close();
			  
		   }catch(Exception e)
		   {
			   e.printStackTrace();
			   }
		   
		return stud;
	}
	
	
	/*
	 * public String addStudent(int STUDENT_NO, String STUDENT_NAME,Date
	 * STUDENT_DOB, Date STUDENT_DOJ) {
	 * 
	 * try{ Class.forName("com.mysql.jdbc.Driver"); con=DriverManager.getConnection(
	 * "jdbc:mysql://localhost:3306/mydb","root","root");
	 * 
	 * java.sql.Statement st=con.createStatement();
	 * 
	 * int row= st.executeUpdate("insert into student values("+
	 * 
	 * STUDENT_NO+",'"+STUDENT_NAME+"',STR_TO_DATE('"+STUDENT_DOB+"', '%m/%d/%Y'),"
	 * + "STR_TO_DATE('"+STUDENT_DOJ+"', '%m/%d/%Y')"); if(row==1){ return
	 * "Success"; } prp.close(); con.close();
	 * 
	 * }catch(Exception e) { System.out.println(e); }
	 * 
	 * return "Fail"; }
	 * 
	 */}
