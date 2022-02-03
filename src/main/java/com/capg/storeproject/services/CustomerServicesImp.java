package com.capg.storeproject.services;

import java.util.ArrayList;
import java.util.List;

import com.capg.storeproject.bean.Products;
import com.capg.storeproject.dao.ProductDao;

public class CustomerServicesImp implements CustomerServices{
	
	static List<Products> ListOfProducts = new ArrayList<Products>();

	public void printListOfProducts() {
		
		System.out.println(ListOfProducts);
/*		for (Products products : ListOfProducts) {
			System.out.println(products.getProductName() + products.getProductPrice());	
		}*/
	}
	
	ProductDao productdaoobj = new ProductDao();

	public void displayProducts() {
		
		// connect to db for products
		List<Products> listOfAllProducts = new ArrayList<Products>();
		listOfAllProducts= productdaoobj.display();
		for (Products products : listOfAllProducts) {
			System.out.println(products);
		}
	}
	
	public int checkout() {
		int sum = 0;
		for (Products products : ListOfProducts) {
			sum += products.getProductPrice();
		}
		return sum;
	}
	
	public void addToCart(Products productsListObj) {
		ListOfProducts.add(productsListObj);
		System.out.println("\nView All Products In Cart:");
		for (Products products : ListOfProducts) {
			System.out.println(products);
		}
	}


	

}
