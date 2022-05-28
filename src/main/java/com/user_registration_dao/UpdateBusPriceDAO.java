package com.user_registration_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model_classes.Bus;
import com.util.ConnectionUtil;

public class UpdateBusPriceDAO {

	// This method is used to update the price of the bus ticket

	public static int updateBusPriceDAO(Bus bus) throws Exception {
		// 1.get connection

		Connection connection = null;
		PreparedStatement statement = null;
		connection=ConnectionUtil.getConnection();
		int rows = 0;

		    // 2.query passing
		System.out.println(bus.getBusTicketPrice());
		System.out.println(bus.getBusId());
			String query = "UPDATE bus_ticket_booking_app_display SET bus_ticket_price=? WHERE bus_id=?";
			statement = connection.prepareStatement(query);
			System.out.println(bus.getBusTicketPrice());
			System.out.println(bus.getBusId());
			statement.setInt(1, bus.getBusTicketPrice());
			statement.setInt(2, bus.getBusId());
			rows = statement.executeUpdate();
System.out.println(rows);

		// 3.close connection
		
		connection.close();
		
		// 4.return number of updated row
		return rows;
	}
}
