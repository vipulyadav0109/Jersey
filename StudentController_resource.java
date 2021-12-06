package com.DEMO.demorest;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;



@Path("/stud")
public class StudentController_resource {
	StudentDAORepo repo= new StudentDAORepo();
	
	@GET
	@Path("/getList")
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStud(){

		return repo.getStudent();
	}
	
	
	  @POST
	  
	  @Path("/save")
	  
	  	public String addStudent(@FormParam("no") int STUDENT_NO,@FormParam("name") String
	  STUDENT_NAME,
	  
	  @FormParam("dob") Date STUDENT_DOB, @FormParam("doj") Date STUDENT_DOJ)	  {	  
	  return repo.addStudent(STUDENT_NO, STUDENT_NAME, STUDENT_DOB, STUDENT_DOJ); }
	  
	 
}
