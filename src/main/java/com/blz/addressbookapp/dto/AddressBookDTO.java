package com.blz.addressbookapp.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp="^[A-Z][a-z]{2,}\\s[A-Z][a-z]{2,}$", message="Invalid name")
	public String name;

	@Pattern(regexp="^[7-9]{1}[0-9]{9}$", message="Invalid phone number")
	public String phoneNumber;

	public String address;

	public String city;

	public String state;

	public String zip;

}
