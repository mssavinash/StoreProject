package com.capg.storeproject.services;

import java.util.List;

import com.capg.storeproject.bean.Products;

public interface CustomerServices {
	
	public	void displayProducts();
	
	public int checkout();
	
	public void addToCart(Products productsListObj);
}
