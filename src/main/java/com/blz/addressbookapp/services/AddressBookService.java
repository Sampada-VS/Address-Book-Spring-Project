package com.blz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> bookDataList = new ArrayList<>();
		bookDataList.add(new AddressBookData(1, new AddressBookDTO("Lisa", "9876543210")));
		return bookDataList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int bookId) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, new AddressBookDTO("Lisa", "9876543210"));
		return bookData;
	}

	@Override
	public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, addressBookDTO);
		return bookData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, addressBookDTO);
		return bookData;
	}

	@Override
	public void deleteAddressBookData(int bookId) {

	}

}
