package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.model.Address;

public interface AddressDAO 
{
	public void setSessionFactory(SessionFactory sessionFactory);
public boolean saveOrUpdate(Address address);
public  void insertAddress(Address address);
	
	public Address getAddressById(int addressId);
	
	public boolean deleteAddressById(int addressId);
	
	public List<Address> getAllAddressOfUser(Integer userid);
	
	public Address getAddressOfUser(String email);


}
