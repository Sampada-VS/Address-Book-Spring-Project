package com.blz.addressbookapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import lombok.extern.slf4j.Slf4j;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.dto.ResponseDTO;
import com.blz.addressbookapp.model.AddressBookData;
import com.blz.addressbookapp.services.IAddressBookService;

@RestController
@RequestMapping("/addressbookservice")
@Slf4j
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> bookDataList = null;
		bookDataList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful ", bookDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{bookId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("bookId") int bookId) {
		AddressBookData bookData = null;
		bookData = addressBookService.getAddressBookDataById(bookId);
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful For Id", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/city/{city}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("city") String city) {
		List<AddressBookData> bookDataList = null;
		bookDataList = addressBookService.getAddressBookDataByCity(city);
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful For City", bookDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
		log.debug("Addressbook DTO : "+addressBookDTO.toString());
		AddressBookData bookData = null;
		bookData = addressBookService.addAddressBookData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully ", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{bookId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@Valid @PathVariable("bookId") int bookId,@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData bookData = null;
		bookData = addressBookService.updateAddressBookData(bookId,addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully ", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("bookId") int bookId) {
		addressBookService.deleteAddressBookData(bookId);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id : " + bookId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
