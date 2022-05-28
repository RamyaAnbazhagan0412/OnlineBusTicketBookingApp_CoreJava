package com.user_registration_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.model_classes.Bus;
import com.util.ConnectionUtil;


public class UpdateBusDAO {
	public static int busDAOUpdate_Bus_from(Bus bus)throws Exception
	{
		// 1.get connection

		Connection connection = null;
		PreparedStatement statement = null;
		connection=ConnectionUtil.getConnection();
		int rows = 0;

		    // 2.query passing

		    String query = "UPDATE bus_ticket_booking_app_display SET bus_from=? WHERE bus_id=?";
			statement = connection.prepareStatement(query);
			statement.setString(1, bus.getBusFrom());
			statement.setInt(2, bus.getBusId());
			rows = statement.executeUpdate();
      
		// 3.close connection
		
		connection.close();
		
		// 4.return number of updated row
		return rows;
		
	}
	public static int busDAOUpdateBus_To(Bus bus)throws Exception
	{
		// 1.get connection

				Connection connection = null;
				PreparedStatement statement = null;
				connection=ConnectionUtil.getConnection();
				int rows = 0;

				    // 2.query passing

				    String query = "UPDATE bus_ticket_booking_app_display SET bus_to=? WHERE bus_id=?";
					statement = connection.prepareStatement(query);
					statement.setString(1, bus.getBusTo());
					statement.setInt(2, bus.getBusId());
					rows = statement.executeUpdate();
		      
				// 3.close connection
				
				connection.close();
				
				// 4.return number of updated row
				return rows;
				
	
	}
	public static int busDAOUpdate_Timing(Bus bus)throws Exception
	{
		// 1.get connection

				Connection connection = null;
				PreparedStatement statement = null;
				connection=ConnectionUtil.getConnection();
				int rows = 0;

				    // 2.query passing

				    String query = "UPDATE bus_ticket_booking_app_display SET bus_timing=? WHERE bus_id=?";
					statement = connection.prepareStatement(query);
					statement.setString(1, bus.getBusTiming());
					statement.setInt(2, bus.getBusId());
					rows = statement.executeUpdate();
		      
				// 3.close connection
				
				connection.close();
				
				// 4.return number of updated row
				return rows;
				

	}
	public static int  busDAOUpdateBus_Name(Bus bus)throws Exception
	{
		// 1.get connection

		Connection connection = null;
		PreparedStatement statement = null;
		connection=ConnectionUtil.getConnection();
		int rows = 0;

		    // 2.query passing

		    String query = "UPDATE bus_ticket_booking_app_display SET bus_name=? WHERE bus_id=?";
			statement = connection.prepareStatement(query);
			statement.setString(1, bus.getBusName());
			statement.setInt(2, bus.getBusId());
			rows = statement.executeUpdate();
      
		// 3.close connection
		
		connection.close();
		
		// 4.return number of updated row
		return rows;
		

	}
	public static int  busDAOUpdateBus_Tickets_Available(Bus bus)throws Exception
	{
		// 1.get connection

		Connection connection = null;
		PreparedStatement statement = null;
		connection=ConnectionUtil.getConnection();
		int rows = 0;

		    // 2.query passing

		    String query = "UPDATE bus_ticket_booking_app_display SET bus_tickets=? WHERE bus_id=?";
			statement = connection.prepareStatement(query);
			statement.setInt(1, bus.getBusTicketsAvailable());
			statement.setInt(2, bus.getBusId());
			rows = statement.executeUpdate();
      
		// 3.close connection
		
		connection.close();
		
		// 4.return number of updated row
		return rows;
		

	}


}
