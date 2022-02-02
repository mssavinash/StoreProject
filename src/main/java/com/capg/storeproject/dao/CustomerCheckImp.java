package com.capg.storeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.capg.storeproject.util.DbConnection;

public class CustomerCheckImp implements CustomerCheck{
	Connection con = DbConnection.con;
	PreparedStatement ps;

	public boolean CustomerLogin(String customerName, String password) {
		String  sqlQuery = "select customerName from storeproject.customers where customerName = ? and  password = ?";
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1, customerName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return true;
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Credentials...");
		}
		return false;
	}
}
