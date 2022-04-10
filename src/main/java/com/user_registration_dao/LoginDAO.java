package com.user_registration_dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;


	import com.util.ConnectionUtil;

	
	public class LoginDAO {
		
		//admin login
		//user login
		public static void adminLogin(String emailId,String password) throws SQLException, ClassNotFoundException {
			
			//1. Get connection
			Connection connection=null;
			connection=ConnectionUtil.getConnection();
		    PreparedStatement statement=null;
		   
		    		
		   //2. Passing query 
		    String query="SELECT admin_emailId,PASSWORD FROM admin_login1 WHERE admin_emailId=?";
		    statement=connection.prepareStatement(query);
		   statement.setString(1,emailId);
		   
		   //4.storing values from database to rs
		   ResultSet rs=statement.executeQuery();
		  String adminEmailId=null;
		  String adminPassword=null;
		  
		  //5.using if condition storing values to adminEmailId,adminpassword
		   if(rs.next())
		   {
			   adminEmailId=rs.getString("admin_emailId");
			  adminPassword=rs.getString("PASSWORD");
			
			   if(adminEmailId==null)
			   {
				  System.out.println("Invalid Login");
				  // AdminLoginDAO.adminLogin(emailId,password);
			   }
			   else if(adminEmailId.equals(emailId.trim())&&adminPassword.equals(password.trim()))
			   {
				   System.out.println("---------------ADMIN LOGIN SUCCESSFUL-------------");
				   
			   }
		   }
		   else {
			  System.out.println("emailId and password does not match");
			   //AdminLoginDAO.adminLogin(emailId,password);
			   
		   }
		   
		  
		   ConnectionUtil.close(statement,connection);
		   
	}
		public static void userLogin(String emailId,String password) throws ClassNotFoundException, SQLException {
			//1. Get connection
			Connection connection=null;
			connection=ConnectionUtil.getConnection();
		    PreparedStatement statement=null;
		   
		    		
		   //2. Passing query 
		    String query="SELECT email_id,PASSWORD FROM user_registration WHERE email_id=?";
		    statement=connection.prepareStatement(query);
		   statement.setString(1,emailId);
		   
		   //4.storing values from database to rs
		   ResultSet rs=statement.executeQuery();
		  String userEmailId=null;
		  String userPassword=null;
		  
		  //5.using if condition storing values to userEmailId,userpassword
		   if(rs.next())
		   {
			  userEmailId=rs.getString("email_id");
			  userPassword=rs.getString("PASSWORD");
			
			   if(userEmailId==null)
			   {
				  System.out.println("Invalid Login");
				  // AdminLoginDAO.adminLogin(emailId,password);
			   }
			   else if(userEmailId.equals(emailId.trim())&&userPassword.equals(password.trim()))
			   {
				   System.out.println("---------------USER LOGIN SUCCESSFUL-------------");
				   
			   }
		   }
		   else {
			  System.out.println("emailId and password does not match");
			   //AdminLoginDAO.adminLogin(emailId,password);
			   
		   }
		   
		  
		   ConnectionUtil.close(statement,connection);
		   
	}
		}



