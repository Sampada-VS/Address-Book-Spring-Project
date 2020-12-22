package com.blz.addressbookapp.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	@Pattern(regexp="^[A-Z][a-z]{2,}\\s[A-Z][a-z]{2,}$", message="Invalid name")
	public String name;

	@Pattern(regexp="^[7-9]{1}[0-9]{9}$", message="Invalid phone number")
	public String phoneNumber;

	public AddressBookDTO(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "Name : " + name + ", Phone Number : " + phoneNumber;
	}
}
