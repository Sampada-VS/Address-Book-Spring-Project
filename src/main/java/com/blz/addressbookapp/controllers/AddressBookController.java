package com.blz.addressbookapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.dto.ResponseDTO;
import com.blz.addressbookapp.model.AddressBookData;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, new AddressBookDTO("Lisa", "9876543210"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful ", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{bookId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("bookId") int bookId) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, new AddressBookDTO("Lisa", "9876543210"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful For Id : " + bookId, bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully ", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully ", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("bookId") int bookId) {
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id : " + bookId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
