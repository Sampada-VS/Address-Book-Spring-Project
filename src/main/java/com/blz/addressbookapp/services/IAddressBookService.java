package com.blz.addressbookapp.services;

import java.util.List;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookDataById(int bookId);

	AddressBookData addAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int bookId);

}
