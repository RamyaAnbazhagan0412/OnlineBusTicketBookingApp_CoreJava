package com.test_classes;

import java.util.Scanner;

import com.model_classes.Bus;
import com.user_registration_dao.InsertBusDAO;

public class InsertBusDAOTest {
	public static void main(String [] args) throws Exception {
				Scanner sc=new Scanner(System.in );
				System.out.println("Enter Bus Name ");
				String busName=sc.nextLine();
				System.out.println("Enter Bus From ");
				String busFrom=sc.nextLine();
				System.out.println("Enter Bus To");
				String busTo=sc.nextLine();
				System.out.println("Enter bus Timing ");
				String busTiming=sc.nextLine();
				System.out.println("Enter bus Tickets Available ");
				Integer busTickets=sc.nextInt();
				System.out.println("Enter bus Ticket Price ");
				Integer busTicketPrice=sc.nextInt();
				

		Bus obj= new Bus();
		obj.setBusName(busName);
		obj.setBusFrom(busFrom);
		obj.setBusTo(busTo);
		obj.setBusTiming(busTiming);
		obj.setBusTicketsAvailable(busTickets);
		obj.setBusTicketPrice(busTicketPrice);
		
		int insert=InsertBusDAO.insertBus(obj);
		if(insert==1)
		{
			System.out.println(" Successful inserted");
		}
		else
		{
			System.out.println("Insertion Unsuccesssful");
		}
	}
}
