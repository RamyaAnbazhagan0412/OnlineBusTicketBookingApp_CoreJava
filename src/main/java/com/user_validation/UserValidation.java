package com.user_validation;


import com.callable_class.UserRegistrationClass;
import com.model_classes.UserRegistration;

public class UserValidation {

	public static void userValidator(UserRegistration userReg) throws Exception{
		try {
			if(userReg.getUserName()==null||userReg.getUserName().isEmpty())			{
				throw new Exception("Invalid Name");
			}
			else if(userReg.getEmailId()==null||userReg.getEmailId().isEmpty()||!(userReg.getEmailId().endsWith("@gmail.com")))
			{
				throw new Exception("Invalid EmailId");
				}
			else if(userReg.getPassword()==null|userReg.getPassword().isEmpty())
			{
				throw new Exception("Invalid password");
				}
			else if((userReg.getPassword().length()<=8)&&(userReg.getPassword().length()>=16)) {
				throw new Exception("password should be minimum 8 character and maximum 16 character ");
			}
			else if(userReg.getPhoneNumber()==null||userReg.getPhoneNumber().isEmpty()||!(userReg.getPhoneNumber().length()==10))
			{
				throw new Exception("Invalid phone number");
				}
			
			}
		catch(Exception e) {
            System.out.println(e.getMessage());	
            System.out.println("Login Again");
            UserRegistrationClass.userRegistrationClass();

			}
	
		}
	}


