package com.blz.addressbookapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.exceptions.AddressBookException;
import com.blz.addressbookapp.model.AddressBookData;
import com.blz.addressbookapp.repository.AddressBookRepository;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int bookId) {
		return addressBookRepository
				.findById(bookId)
				.orElseThrow(() -> new AddressBookException("Addressbook entry Not found"));
	}

	@Override
	public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(addressBookDTO);
		log.debug("Addressbook Data : "+bookData.toString());
		return addressBookRepository.save(bookData);
	}

	@Override
	public AddressBookData updateAddressBookData(int bookId, AddressBookDTO addressBookDTO) {
		AddressBookData bookData = this.getAddressBookDataById(bookId);
		bookData.updateAddressBookData(addressBookDTO);
		return addressBookRepository.save(bookData);
	}

	@Override
	public void deleteAddressBookData(int bookId) {
		AddressBookData bookData = this.getAddressBookDataById(bookId);
		addressBookRepository.delete(bookData);
	}

}
