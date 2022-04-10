package com.test_classes;

import java.sql.SQLException;
import java.util.Scanner;

import com.user_registration_dao.LoginDAO;

public class UserLoginTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Getting email,password as input 
				System.out.println("----------------WELCOME TO BUS TICKET BOOKING APP----------------");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Email Id");
				String emailId=sc.nextLine();
				System.out.println("Enter Password");
				String password=sc.nextLine();
				
				//2. calling  the admin class.method
				
				LoginDAO.userLogin(emailId, password);
				
					}

	

}
