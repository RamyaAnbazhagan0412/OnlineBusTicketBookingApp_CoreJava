package com.test_classes;

import java.sql.SQLException;

import java.util.Scanner;

import com.model_classes.Bus;

import com.user_registration_dao.BusDetailsDAO;

public class DisplayBusDetailsDAOTest {
// this method is used to test DisplayBusDetailsDAO
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// create object for model class
		Bus db= new Bus();
		// get id from user
		Scanner sc=new Scanner(System.in);
		int busId=sc.nextInt();
		// set id in model class
		db.setBusId(busId);
		// create object for DAO class and pass the model class object
		
		Bus bus=BusDetailsDAO.busDetailsDAO(db);
	    System.out.println(bus);
	}
}