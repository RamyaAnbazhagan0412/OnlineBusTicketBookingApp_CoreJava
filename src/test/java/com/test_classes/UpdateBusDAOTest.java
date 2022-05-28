package com.test_classes;

import java.util.Scanner;

import com.model_classes.Bus;
import com.user_registration_dao.UpdateBusPriceDAO;

public class UpdateBusDAOTest {
public static void main(String [] args) throws Exception {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter bus id");
	int busId=sc.nextInt();
	System.out.println("Enter ticket price to be updated");
	int ticketPrice=sc.nextInt();
	
	Bus obj= new Bus();
	obj.setBusId(busId);
	obj.setBusTicketPrice(ticketPrice);
	
	int update=UpdateBusPriceDAO.updateBusPriceDAO(obj);
	if(update==1)
	{
		System.out.println("Updation Successful");
	}
	else
	{
		System.out.println("Updation Unsuccesssful");
	}
}
}
