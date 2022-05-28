package com.test_classes;

import java.util.Scanner;

import com.model_classes.Bus;
import com.user_registration_dao.DeleteBusDAO;

public class DeleteBusTest {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus id");
		Integer busId=sc.nextInt();
		Bus busObj=new Bus();
		busObj.setBusId(busId);
        DeleteBusDAO obj=new DeleteBusDAO();
        int deletedRow =obj.busDAODelete(busObj);
         if(deletedRow==1) {
  	      System.out.println("Bus Deleted");
  		
  			} 
         else {
        	 System.out.println("Bus not Deleted");
         }
	}
}
