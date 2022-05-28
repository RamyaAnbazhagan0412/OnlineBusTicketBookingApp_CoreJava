package com.test_classes;

import java.sql.SQLException;
import java.util.List;
import com.model_classes.Bus;
import com.user_registration_dao.BusListDAO;

public class DisplayBusTest {

	public static void main(String[] args) throws Exception {
	//	DisplayBusModel ur=new DisplayBusModel();
	
			BusListDAO displayObj=new BusListDAO();	           
			List<Bus> busList=displayObj.busListDAO();
			for(Bus obj: busList){
								System.out.println(obj);
			}
	}
}

		


