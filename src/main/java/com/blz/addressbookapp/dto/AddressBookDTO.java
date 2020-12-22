package com.blz.addressbookapp.dto;

public class AddressBookDTO {
	public String name;
	public String phoneNumber;

	public AddressBookDTO(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "Name : " + name + ", Phone Number : " + phoneNumber;
	}
}
