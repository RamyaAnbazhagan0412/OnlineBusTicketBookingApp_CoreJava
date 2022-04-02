package com.test_classes;

import java.sql.SQLException;

import com.user_registration_dao.AdminLoginDAO;

public class AdminLoginTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//1. calling  the admin class.method
		
		AdminLoginDAO.adminLogin();
	}

}