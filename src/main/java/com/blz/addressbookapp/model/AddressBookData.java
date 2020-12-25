package com.blz.addressbookapp.model;

import com.blz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {

	private int addressBookId;
	private String name;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private String zip;

	public AddressBookData() {
	}

	public AddressBookData(int bookId, AddressBookDTO addressBookDTO) {
		this.addressBookId = bookId;
		this.name = addressBookDTO.name;
		this.phoneNumber = addressBookDTO.phoneNumber;
		this.address=addressBookDTO.address;
		this.city=addressBookDTO.city;
		this.state=addressBookDTO.state;
		this.zip=addressBookDTO.zip;
	}

}
