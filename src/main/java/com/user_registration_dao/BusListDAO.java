package com.user_registration_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model_classes.Bus;
import com.util.ConnectionUtil;

public class BusListDAO {
	public static List<Bus> busListDAO() throws ClassNotFoundException, SQLException {
		// 1. create list
		List<Bus> displayBus = new ArrayList<Bus>();

		// 2.get connection
		Connection connection = null;
		PreparedStatement statement = null;
		connection = ConnectionUtil.getConnection();

		// 3.select query
		String query = "SELECT bus_id,bus_name,bus_from ,bus_to , bus_timing, bus_tickets,bus_ticket_price FROM bus_ticket_booking_app_display";
		statement = connection.prepareStatement(query);

		// 4.using executeQuery() passing query
		ResultSet rs = statement.executeQuery();

		System.err.println(
				"\nBus Id      Bus Name       Bus From      Bus To      Bus Date    Bus Timing     BusTicketsAvailable     BusTicketPrice");
		while (rs.next()) {

			// 5.data from database is stored in local variables
			int id = rs.getInt("bus_id");
			String busName = rs.getString("bus_name");
			String busFrom = rs.getString("bus_from");
			String busTo = rs.getString("bus_to");
			String busTiming = rs.getString("bus_timing");
			int busTickets = rs.getInt("bus_tickets");
			int busTicketPrice = rs.getInt("bus_ticket_Price");

			Bus obj = new Bus();
			// 6.local variables values are setted to model class using setter methods
			obj.setBusId(id);
			obj.setBusName(busName);
			obj.setBusFrom(busFrom);
			obj.setBusTo(busTo);
			obj.setBusTiming(busTiming);
			obj.setBusTicketsAvailable(busTickets);
			obj.setBusTicketPrice(busTicketPrice);

			// 7.the model class object is added to listArray
			displayBus.add(obj);
		}

		// 8.close the connection
		connection.close();

		// 9.return List object
		return displayBus;

	}
}
