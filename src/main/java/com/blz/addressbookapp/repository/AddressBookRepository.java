package com.blz.addressbookapp.repository;

import java.util.List;

import com.blz.addressbookapp.model.AddressBookData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer>{
    
    @Query(value = "select * from addressbook where city=:city", nativeQuery = true)
    List<AddressBookData> getAddressBookDataByCity(String city);
}
