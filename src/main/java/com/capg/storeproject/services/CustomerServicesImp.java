package com.capg.storeproject.services;

import java.util.ArrayList;
import java.util.List;

import com.capg.storeproject.bean.Products;
import com.capg.storeproject.dao.ProductDao;

public class CustomerServicesImp implements CustomerServices{
	List<Products> ListOfProducts = new ArrayList<Products>();

	public List<Products> getListOfProducts() {
		return ListOfProducts;
	}


	public void setListOfProducts(List<Products> listOfProducts) {
		ListOfProducts = listOfProducts;
	}



	ProductDao productdaoobj = new ProductDao();

	public void displayProducts() {
		
		// connect to db for products
		List<Products> listOfProducts = new ArrayList<Products>();
		listOfProducts= productdaoobj.display();
		
		System.out.println(listOfProducts);
	}

	
	public int checkout() {
		Products productobj = new Products();
		int sum =0;
		for (Products products : ListOfProducts) {
			sum+=productobj.getProductPrice();
		}

		return sum;
	}

	

	public void addToCart(Products productObj) {
		
		ListOfProducts.add(productObj);
		
	}




}
