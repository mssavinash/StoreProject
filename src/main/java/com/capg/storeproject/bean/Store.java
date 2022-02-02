package com.capg.storeproject.bean;

public class Store {
	
	private String storeAdminName;
	private String storeName;
	
	private  String storeId;
	
	private String branchName;
	
	private String storeCategory;

	public String getStoreAdminName() {
		return storeAdminName;
	}

	public void setStoreAdminName(String storeAdminName) {
		this.storeAdminName = storeAdminName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getStoreCategory() {
		return storeCategory;
	}

	public void setStoreCategory(String storeCategory) {
		this.storeCategory = storeCategory;
	}



	public Store(String storeAdminName, String storeName, String storeId, String branchName, String storeCategory) {
		super();
		this.storeAdminName = storeAdminName;
		this.storeName = storeName;
		this.storeId = storeId;
		this.branchName = branchName;
		this.storeCategory = storeCategory;
	}

	@Override
	public String toString() {
		return "Store [storeAdminName=" + storeAdminName + ", storeName=" + storeName + ", storeId=" + storeId
				+ ", branchName=" + branchName + ", storeCategory=" + storeCategory + "]";
	}



	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
