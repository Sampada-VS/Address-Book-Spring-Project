package com.blz.addressbookapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp="^[A-Z][a-z]{2,}\\s[A-Z][a-z]{2,}$", message="Invalid name")
	public String name;

	@Pattern(regexp="^[7-9]{1}[0-9]{9}$", message="Invalid phone number")
	public String phoneNumber;

	@Pattern(regexp="^(?=.*\\s)(?=.*[,])[A-Za-z0-9]{3,}[A-Za-z0-9\\s,]{1,}$", message="Invalid address")
	public String address;

	@NotBlank(message = "City should not be empty")
	public String city;

	@NotBlank(message = "State should not be empty")
	public String state;

	@Pattern(regexp="^[1-9]{1}[0-9]{5}$", message="Invalid zip code")
	public String zip;

}
