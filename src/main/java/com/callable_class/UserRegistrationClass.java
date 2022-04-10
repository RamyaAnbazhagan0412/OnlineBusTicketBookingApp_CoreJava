package com.callable_class;
import java.util.Scanner;

import com.model_classes.UserRegistrationModel;
import com.user_registration_dao.UserRegistrationDAO;
import com.user_validation.UserValidation;

public class UserRegistrationClass {
public static void userRegistrationClass()throws Exception {
			//1.creating object for user registration class
			
			UserRegistrationModel userRegistration=new UserRegistrationModel();
			Scanner sc= new Scanner(System.in);
			
			//2.getting input from user using Scanner  class
			
			System.out.println("Enter name");
			String name=sc.nextLine();
			
			//3. using object and  set method assigning to the  variable inn model class
			userRegistration.setUserName(name);
			System.out.println("Enter emailId");
			String emailId=sc.nextLine();
			userRegistration.setEmailId(emailId);
			System.out.println("Enter password");
			String password=sc.nextLine();
			userRegistration.setPassword(password);
			System.out.println("Enter phone number");
			String phoneNumber=sc.nextLine();
			userRegistration.setPhoneNumber(phoneNumber);
			
			UserValidation.userValidator(userRegistration);
			UserRegistrationDAO.userRegistrationDAO(userRegistration);
		

	}

}
