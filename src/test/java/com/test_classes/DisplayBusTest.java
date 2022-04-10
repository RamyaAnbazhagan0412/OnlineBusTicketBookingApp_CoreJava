package com.test_classes;

import java.sql.SQLException;
import java.util.List;
import com.model_classes.DisplayBusModel;
import com.user_registration_dao.DisplayBusDAO;

public class DisplayBusTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	DisplayBusModel ur=new DisplayBusModel();
	
			DisplayBusDAO displayObj=new DisplayBusDAO();	           
			List<DisplayBusModel> obj=DisplayBusDAO.displayBusDAO(displayObj);
			for(DisplayBusModel busList: obj){
								System.out.println(busList);
			}
	}
}

		


