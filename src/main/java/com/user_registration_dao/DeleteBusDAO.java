package com.user_registration_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.model_classes.Bus;
import com.util.ConnectionUtil;

public class DeleteBusDAO {
	// This method is used to delete the particular bus details in the database
	public int busDAODelete(Bus ds) throws Exception {
		// 1.get connection

		Connection connection = null;
		PreparedStatement statement = null;
		connection = ConnectionUtil.getConnection();

		// 2.pass query

		String query = "DELETE FROM  bus_ticket_booking_app_display WHERE  bus_id=?";
		statement = connection.prepareStatement(query);
		statement.setInt(1, ds.getBusId());
		int row = statement.executeUpdate();

		// 3.close the connection

		connection.close();

		// 4.return the number of deleted bus
		return row;

	}
}
