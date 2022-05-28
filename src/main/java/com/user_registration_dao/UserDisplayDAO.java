package com.user_registration_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model_classes.UserRegistration;
import com.util.ConnectionUtil;

public class UserDisplayDAO {

// This method is used to list user details to the Admin

	public static List<UserRegistration> UserDisplayDAO(UserRegistration obj)
			throws SQLException, ClassNotFoundException {
		// 1. create list
		List<UserRegistration> userDisplay = new ArrayList<UserRegistration>();

		// 2.get connection
		Connection connection = null;
		PreparedStatement statement = null;
		connection = ConnectionUtil.getConnection();

		// 3.select query
		String query = "SELECT full_name,email_id,PASSWORD,phone_number FROM user_registration ";
		statement = connection.prepareStatement(query);

		// 4.using executeQuery() passing query
		ResultSet rs = statement.executeQuery();

		System.err.println("\nUserName      EmailId       Password      PhoneNumber");
		while (rs.next()) {

			// 5.getting user data from database and assigning to local variables

			String userName = rs.getString("full_name");
			String userEmailId = rs.getString("email_id");
			String userPassword = rs.getString("PASSWORD");
			String userPhoneNumber = rs.getString("phone_number");

			// 6.local variable values are setted to model class

			obj.setUserName(userName);
			obj.setEmailId(userEmailId);
			obj.setPassword(userPassword);
			obj.setPhoneNumber(userPhoneNumber);

			// 7.add model class object to list

			userDisplay.add(obj);
		}
		// 8.close the connection
		connection.close();

		// 9.return list
		return userDisplay;

	}
}
