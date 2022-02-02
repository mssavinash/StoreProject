package com.capg.storeproject.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.storeproject.bean.Products;
import com.capg.storeproject.dao.CustomerCheckImp;
import com.capg.storeproject.dao.ProductDao;
import com.capg.storeproject.services.CustomerServicesImp;

public class MainMenu {

	public static void main(String[] args) {
		Scanner star = new Scanner(System.in);
		System.out.println("Enter username");
		String username = star.nextLine();
		System.out.println("enter password");
		String password = star.nextLine();
		CustomerCheckImp customerLoginObj = new CustomerCheckImp();
		customerLoginObj.CustomerLogin(username, password);
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("1.Display products list");
			System.out.println("2.Display by products category");
			System.out.println("3.Add products by store admin");
			System.out.println("4.Add to cart ");
			System.out.println("5.Get products details by product Id");
			System.out.println("6.Total price of products");
			System.out.println("9.Logout");
			Scanner sc = new Scanner(System.in);
			Scanner scStr = new Scanner(System.in);
	
			int choice = sc.nextInt();
			ProductDao productDaoObj = new ProductDao();
			CustomerServicesImp customerServicesImpObj = new CustomerServicesImp();
			switch (choice) {
			case 1:
				CustomerServicesImp customerObj = new CustomerServicesImp();
				customerObj.displayProducts();
				break;
				
			case 2:
				System.out.println("Enter the category");
				String catogory = scStr.nextLine();
				System.out.println(productDaoObj.displayByCategory(catogory));
				break;
			case 3 :
				System.out.println("enter product name:");
				String productName = scStr.nextLine();
				
				System.out.println("enter product id:");
				int productId = sc.nextInt();
				
				System.out.println("enter product price:");
				float productPrice = sc.nextFloat();
				
				System.out.println("enter product Category");
				String productCategory = scStr.nextLine();
				
				Products p = new Products(productName,productId,productPrice,productCategory);
				productDaoObj.addProducts(p);
	
				break;
				
			case 4:
				while(true) {
					System.out.println("1.Continue the shopping");
					System.out.println("2.Exit the cart");
					int choice2 = sc.nextInt();
					switch (choice2) {
					case 1:
						System.out.println("enter the product Id:");
						int productId1 = scStr.nextInt();
						customerServicesImpObj.addToCart(productDaoObj.getProductById(productId1));
						break;

					case 2:
						//System.exit(0);
						break;
					}
				}
			case 5:
				System.out.println(customerServicesImpObj.getListOfProducts());
				break;
			case 6:
				System.out.println("total bill of products in cart : "+ customerServicesImpObj.checkout());
			case 9:
				System.out.println("thank you shopping\n");
				System.exit(0);
			}
		}
	}
}
