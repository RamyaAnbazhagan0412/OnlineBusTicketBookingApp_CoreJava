package com.user_registration_dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;


	import com.util.ConnectionUtil;

	public class AdminLoginDAO {
		public static void adminLogin() throws SQLException, ClassNotFoundException {
			//1.Getting email,password as input 
			System.out.println("----------------WELCOME TO BUS TICKET BOOKING APP----------------");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Email Id");
			String emailId=sc.nextLine();
			System.out.println("Enter Password");
			String password=sc.nextLine();
		
			//2. Get connection
			Connection connection=null;
			 connection=ConnectionUtil.getConnection();
		    PreparedStatement statement=null;
		   
		    		
		   //3. Passing query 
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
				   AdminLoginDAO.adminLogin();
			   }
			   else if(adminEmailId.equals(emailId.trim())&&adminPassword.equals(password.trim()))
			   {
				   System.out.println("---------------ADMIN LOGIN SUCCESSFUL-------------");
				   
			   }
		   }
		   else {
			  System.out.println("emailId and password does not match");
			   AdminLoginDAO.adminLogin();
			   
		   }
		   
		  
		   ConnectionUtil.close(statement,connection);
		   
	}
	}


