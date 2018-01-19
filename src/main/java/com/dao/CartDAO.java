package com.dao;

import java.util.List;

import com.model.Cart;

public interface CartDAO 
{
public boolean saveProductToCart(Cart cart);
	
public Cart getitem(int prodId, String email);
	
	public List<Cart>listCart();
	public boolean removeCartById(int cart_id);
	
	public long cartsize(String email) ;
	
	public double CartPrice(String email) ;
	
	public Cart editCartById(int cart_id);
	public Cart getCartById(int cart_id);
	
	public List<Cart>listCartbyEmail(String email);

}
