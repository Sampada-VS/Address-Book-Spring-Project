package com.blz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	List<AddressBookData> bookDataList = new ArrayList<>();

	@Override
	public List<AddressBookData> getAddressBookData() {
		return bookDataList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int bookId) {
		return bookDataList.get(bookId - 1);
	}

	@Override
	public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(bookDataList.size() + 1, addressBookDTO);
		bookDataList.add(bookData);
		return bookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int bookId, AddressBookDTO addressBookDTO) {
		AddressBookData bookData = this.getAddressBookDataById(bookId);
		bookData.setName(addressBookDTO.name);
		bookData.setPhoneNumber(addressBookDTO.phoneNumber);
		bookDataList.set(bookId - 1, bookData);
		return bookData;
	}

	@Override
	public void deleteAddressBookData(int bookId) {
		bookDataList.remove(bookId - 1);
	}

}
