package com.capg.storeproject.services;

import com.capg.storeproject.bean.Products;

public interface CustomerServices {
	
	public	void displayProducts();
	
	public void addToCart(Products productObj);
	

	public int checkout();
}
