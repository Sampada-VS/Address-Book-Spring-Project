package com.blz.addressbookapp.services;

import java.util.List;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookDataById(int bookId);

	List<AddressBookData> getAddressBookDataByCity(String city);
	
	AddressBookData addAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int bookId, AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int bookId);

}
