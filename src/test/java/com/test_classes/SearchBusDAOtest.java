package com.test_classes;

import java.util.List;
import java.util.Scanner;

import com.model_classes.Bus;
import com.user_registration_dao.SearchBusDAO;


public class SearchBusDAOtest {

	public static void main(String[] args) throws Exception {
		
		//1.bus list by from location
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bus from");
		String busFrom=sc.next();
		Bus busObj1=new Bus();
		busObj1.setBusFrom(busFrom);
		
		
		List<Bus> list1=SearchBusDAO.BusListByBusFrom(busObj1);
		for(Bus busList:list1){
			System.out.println(busList);
		}
		
		//2.bus list by to
			System.out.println("Enter Bus To");
			String busTo=sc.next();
			Bus busObj2=new Bus();
			busObj2.setBusTo(busTo);
			
			
			List<Bus> list2=SearchBusDAO.BusListByBusFrom(busObj2);
			for(Bus busList:list2){
				System.out.println(busList);
			}
		
		//3.Bus  list by Timing 
					System.out.println("Enter Bus Timing");
					String busTiming=sc.next();
					Bus busObj3=new Bus();
					busObj3.setBusTiming(busTiming);
					
				    List<Bus> list3=SearchBusDAO.BusListByBusTiming(busObj3);;
					for(Bus busList:list3){
						System.out.println(busList);
					}
					
					//4.Bus list by Tickets Available 
					System.out.println("Enter Bus Tickets Available");
					int busTicketsAvailable=sc.nextInt();
					Bus busObj4=new Bus();
					busObj4.setBusTicketsAvailable(busTicketsAvailable);
					
				    List<Bus> list4=SearchBusDAO.BusListByBusTiming(busObj4);;
					for(Bus busList:list4){
						System.out.println(busList);
					}
										
								
						
					//5.Bus list by Ticket price 
					System.out.println("Enter Bus Ticket price ");
					int busTicketsPrice=sc.nextInt();
					Bus busObj5=new Bus();
					busObj5.setBusTicketPrice(busTicketsPrice);
					
				    List<Bus> list5=SearchBusDAO.BusListByBusTiming(busObj5);;
					for(Bus busList:list5){
						System.out.println(busList);
					}
				
					//6.Bus List all
					
									
					List<Bus> list6=SearchBusDAO.selectAll();
					for(Bus busList:list6){
						System.out.println(busList);
					}
					
					//7.bus list by bus name
					System.out.println("Enter Bus To");
					String busName=sc.next();
					Bus busObj7=new Bus();
					busObj2.setBusTo(busName);
					
					
					List<Bus> list7=SearchBusDAO.BusListByBusFrom(busObj7);
					for(Bus busList:list7){
						System.out.println(busList);
					}
				
									
}
}