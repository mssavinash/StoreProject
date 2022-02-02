package com.capg.storeproject.bean;

public class StoreAdmin {
	private String storeAdminName;

	public String getStoreAdminName() {
		return storeAdminName;
	}

	public void setStoreAdminName(String storeAdminName) {
		this.storeAdminName = storeAdminName;
	}

	public StoreAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreAdmin(String storeAdminName) {
		super();
		this.storeAdminName = storeAdminName;
	}

	@Override
	public String toString() {
		return "StoreAdmin [storeAdminName=" + storeAdminName + "]";
	}
	
	
	
	

}
