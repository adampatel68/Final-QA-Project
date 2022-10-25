package com.qa.ecommerce.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	public static Connection SQLConnection() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/user?useTimezone=true&serverTimezone=UTC", "root", "username1479");

		return conn;
	}

}
