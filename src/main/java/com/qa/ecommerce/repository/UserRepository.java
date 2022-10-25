package com.qa.ecommerce.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.qa.ecommerce.db.DBUtils;
import com.qa.ecommerce.pojo.user;

public class UserRepository {
	public static void save(user user) throws Exception {
		Connection conn = DBUtils.SQLConnection();
		PreparedStatement pstmt = conn.prepareStatement("insert into user values (?,?,?,?,?,?)");
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getCompanyName());
		pstmt.setString(3, user.getCompanyContactNo());
		pstmt.setString(4, user.getCompanyEmail());
		pstmt.setString(5, user.getCompanyAddress());
		pstmt.setString(6, user.getPassword());
		pstmt.execute();

	}

	public static user validateUserCredentials(String companyEmail, String password) throws Exception {

		user user = null;

		Connection conn = DBUtils.SQLConnection();
		PreparedStatement pstmt = conn.prepareStatement("Select * from user where companyEmail = ? and password = ?;");

		pstmt.setString(1, companyEmail);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			companyEmail = rs.getString(4);
			password = rs.getString(6);
			String name = rs.getString(1);
			String companyName = rs.getString(2);
			String companyContactNo = rs.getString(3);
			String companyAddress = rs.getString(5);

			user = new user(name, companyName, companyContactNo, companyEmail, companyAddress, password);

		}

		return user;

	}
}
