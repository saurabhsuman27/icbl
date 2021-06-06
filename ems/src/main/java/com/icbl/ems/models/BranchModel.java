package com.icbl.ems.models;

public class BranchModel {

	private String branchCode;
	
	private String brnachName;
	
	private AddressModel address;

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBrnachName() {
		return brnachName;
	}

	public void setBrnachName(String brnachName) {
		this.brnachName = brnachName;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}
	
	
}
