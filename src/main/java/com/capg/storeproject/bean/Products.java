package com.capg.storeproject.bean;

public class Products {
	
	private String productName;
	
	private int productId;
	private float productPrice;
	
	private String productCategory;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Products(String productName, int productId, float productPrice, String productCategory) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Products [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", productCategory=" + productCategory + "]";
	}
	
	

}
