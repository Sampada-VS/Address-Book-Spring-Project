package com.blz.addressbookapp.model;

import com.blz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {

	private int addressBookId;
	private String name;
	private String phoneNumber;

	public AddressBookData() {
	}

	public AddressBookData(int bookId, AddressBookDTO addressBookDTO) {
		this.addressBookId = bookId;
		this.name = addressBookDTO.name;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

	public int getAddressBookId() {
		return addressBookId;
	}

	public void setAddressBookId(int addressBookId) {
		this.addressBookId = addressBookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
