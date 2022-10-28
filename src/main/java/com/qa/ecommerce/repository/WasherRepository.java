package com.qa.ecommerce.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.qa.ecommerce.db.DBUtils;
import com.qa.ecommerce.pojo.IPSOwasher;

public class WasherRepository {
	public static List<IPSOwasher> getAllwashers() throws Exception {
		List<IPSOwasher> AllWashers = new ArrayList<IPSOwasher>();

		Connection conn = DBUtils.SQLConnection();
		PreparedStatement pstmt = conn.prepareStatement("Select * from IPSOwasher");
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String washerName = rs.getString(1);
			String washerLoadCapacity = rs.getString(2);
			String washerDimension = rs.getString(3);
			String washerNetWeight = rs.getString(4);
			String washerPrice = rs.getString(5);

			IPSOwasher washer = new IPSOwasher(washerName, washerLoadCapacity, washerDimension, washerNetWeight,
					washerPrice);
			AllWashers.add(washer);

		}
		return AllWashers;

	}
	
//	public List<IPSOwasher> getAllWashers() throws Exception {
//		
//		//UserRepository AllWashers = new UserRepository();
//		
//		List<IPSOwasher> AllWashers = AllWashers.getAllWashers();
//		
//		return AllWashers;
//	}

}
