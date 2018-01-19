package com.dao;

import java.util.List;

import com.model.Address;

public interface AddressDAO 
{
public boolean saveOrUpdate(Address address);
	
	public Address getAddressById(int addressId);
	
	public boolean deleteAddressById(int addressId);
	
	public List<Address> getAllAddressOfUser(String email);
	
	public Address getAddressOfUser(String email);


}
