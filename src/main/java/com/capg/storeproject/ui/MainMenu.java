package com.capg.storeproject.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capg.storeproject.bean.Products;
import com.capg.storeproject.dao.CustomerCheckImp;
import com.capg.storeproject.dao.ProductDao;
import com.capg.storeproject.services.CustomerServicesImp;

public class MainMenu {

	public static void main(String[] args) {
		Scanner star = new Scanner(System.in);
	/*	System.out.println("Enter username");
		String username = star.nextLine();
		System.out.println("enter password");
		String password = star.nextLine();
		CustomerCheckImp customerLoginObj = new CustomerCheckImp();
		customerLoginObj.CustomerLogin(username, password);
	*/	
		List<Products> productOfCart = new ArrayList<Products>();
		System.out.println("Welcome to Capg Store");
		while(true) {
			System.out.println("\nEnter the choice");
			System.out.println("1.Display products list");
			System.out.println("2.Display by products category");
			System.out.println("3.Add products by store admin");
			System.out.println("4.Add to cart ");
			System.out.println("5.Get products details by product Id");
			System.out.println("6.Get products details by product Category");
			System.out.println("7:View All products in Cart");
			System.out.println("8.Total price of products");
			System.out.println("9.Logout");
			Scanner sc = new Scanner(System.in);
			Scanner scStr = new Scanner(System.in);
	
			int choice = sc.nextInt();
			ProductDao productDaoObj = new ProductDao();
			CustomerServicesImp customerServicesImpObj = new CustomerServicesImp();
			switch (choice) {
			case 1:
				customerServicesImpObj.displayProducts();
				break;
				
			case 2:
				System.out.println("Enter the category");
				String catogory = scStr.nextLine();
				for (Products valueCategory : (productDaoObj.displayByCategory(catogory))) {
					System.out.println(valueCategory);
				}
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
				/*customerServicesImpObj.displayProducts();
				System.out.println("\nEnter the product Id:");
				int productId2 = scStr.nextInt();
				customerServicesImpObj.addToCart(productDaoObj.getProductById(productId2));
				break;*/
				Boolean temp = true;
				while(temp) {
					System.out.println("1.Continue the shopping");
					System.out.println("2.Exit the cart");
					int choice2 = sc.nextInt();
					switch (choice2) {
					case 1:
						customerServicesImpObj.displayProducts();
						System.out.println("enter the product Id:");
						int productId1 = scStr.nextInt();
						customerServicesImpObj.addToCart(productDaoObj.getProductById(productId1));
						break;

					case 2:
						temp = false;
					}
				}
				break;
			case 5:
				System.out.println("enter the product Id:");
				int productId1 = scStr.nextInt();
				for (Products valueId : (productDaoObj.getProductByIdForSearch(productId1))) {
					System.out.println(valueId);
				}
				break;
			case 6:
				System.out.println("Enter the product Category:");
				String productCategoryForSearch = scStr.nextLine();
				for (Products valueCategory: (productDaoObj.displayByCategory(productCategoryForSearch))) {
					System.out.println(valueCategory);
				}
				break;
			case 7:
				System.out.println("View All products in Cart:");
				//System.out.println(customerServicesImpObj.getListOfProducts());
				customerServicesImpObj.printListOfProducts();
			/*	for (Products valueOfCart : (customerServicesImpObj.getListOfProducts())) {
					System.out.println(valueOfCart);
				}*/
				break;
			case 8:
				System.out.println("total bill of products in cart : "+ customerServicesImpObj.checkout());
				break;
			case 9:
				System.out.println("thank you for shopping\n");
				System.exit(0);
			}
		}
	}
}
