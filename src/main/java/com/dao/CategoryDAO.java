package com.dao;

import java.util.List;

import com.model.*;

public interface CategoryDAO 
{
	public void insertCategory(Category category);
	public List<Category> retrieve();

	

}
