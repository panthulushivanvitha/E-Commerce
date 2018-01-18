package com.dao;

import java.util.List;

import com.model.*;

public interface ProductDAO
{
	public void insertProduct(Product product);

	public Product findByPID(int pid);
	public List<Product> retrieve();

	


	

}
