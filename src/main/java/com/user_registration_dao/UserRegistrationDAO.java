package com.user_registration_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.model_classes.UserRegistration;
import com.util.ConnectionUtil;

public class UserRegistrationDAO {
// This method is used to insert user registration data	to database
		public static void userRegistrationDAO( UserRegistration us) throws Exception {
			//1.get connection
			
			Connection connection=null;
			PreparedStatement statement=null;
			connection=ConnectionUtil.getConnection();
			
			//2.passing insert query
			String query="INSERT INTO user_registration(full_name,email_id,PASSWORD,phone_number)VALUES( ?,?,?,?)";
            statement=connection.prepareStatement(query); 
			//3.using prepared statement
			statement.setString(1,us.getUserName());
		    statement.setString(2,us.getEmailId());
		    statement.setString(3,us.getPassword());
		    statement.setString(4,us.getPhoneNumber());
		    
		    //4.using executeUpdate() passing query
			int row=statement.executeUpdate();
			
			if(row==1) {
			System.out.println("Successfully Registerd");
		    }
			
			}
		



}
