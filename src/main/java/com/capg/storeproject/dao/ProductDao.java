package com.capg.storeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.capg.storeproject.bean.Products;
import com.capg.storeproject.util.DbConnection;

public class ProductDao {
	
	//data access operation
	
	
	Connection con = DbConnection.con;
	PreparedStatement ps;
	
	public List<Products> display()
	{
		String sqlQuery = "select * from storeproject.products";
		List<Products> productsList = new ArrayList<Products>();
		try{
			ps = con.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String productName = rs.getString("productName");
				int productId = rs.getInt("productId");
				float productPrice = rs.getFloat(("productPrice"));
				String productCategory = rs.getString("productCategory");
				
				Products p = new Products(productName,productId,productPrice,productCategory);
				
				productsList.add(p);
			}
			return productsList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	public List<Products> displayByCategory(String category)
	{
		String sqlQuery = "select * from storeproject.products where productCategory = ?";
		List<Products> productList = new ArrayList<Products>();
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1, category);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String productName = rs.getString("productName");
				int productId = rs.getInt("productId");
				float productPrice = rs.getFloat("productPrice");
				String productCategory = rs.getString("productCategory");
				
				Products p = new Products(productName,productId,productPrice,productCategory);
				
				productList.add(p);
			}
			if(productList != null)
			return productList;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	
	public boolean addProducts(Products p)
	{
		String sqlQuery = "insert into storeproject.products values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1,p.getProductName());
			ps.setInt(2, p.getProductId());
			ps.setFloat(3, p.getProductPrice());
			ps.setString(4,p.getProductCategory());
		
			int i=ps.executeUpdate();
			if(i==1)
				return true;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	public Products getProductById(int productId1)
	{
		String sqlQuery = "select * from storeproject.products where productId = ?";
		
		try{
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, productId1);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String productName = rs.getString("productName");
				int productId = rs.getInt("productId");
				float productPrice = rs.getFloat(("productPrice"));
				String productCategory = rs.getString("productCategory");
				
				Products p = new Products(productName,productId,productPrice,productCategory);
				
				return p;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
