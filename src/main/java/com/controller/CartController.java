/*package com.controller;


import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daoimpl.*;
import com.model.*;

@Controller
public class CartController
{
@Autowired
SupplierDAOImpl supplierDAOImpl;
@Autowired
CategoryDAOImpl categoryDAOImpl;
@Autowired
ProductDAOImpl productDAOImpl;
@Autowired
CartDAOImpl cartDAOImpl;
@Autowired
OrdersDAOImpl ordersDAOImpl;
@Autowired
UserDAOImpl userDAOImpl;
@RequestMapping(value="/prodDetails/${p.pid}")
public ModelAndView prodDet(@PathVariable("pid")int pid)
{
	ModelAndView mv= new ModelAndView();
	Product prod=productDAOImpl.findByPID(pid);
	mv.addObject("prod",prod);
	mv.setViewName("prodDetails");
	
	return mv;
	
}
@RequestMapping(value="/addToCart",method=RequestMethod.POST)
public ModelAndView addtocart(HttpServletRequest request)
{
	ModelAndView mv = new ModelAndView();
	Principal principal=request.getUserPrincipal();
	String userEmail=principal.getName();
	try
	{
		int pid=Integer.parseInt(request.getParameter("pid"));
		Double price=Double.parseDouble(request.getParameter("price"));
		int qty=Integer.parseInt(request.getParameter("pQty"));
		String pname=request.getParameter("pname");
		String imagName=request.getParameter("imagName");
		Cart cartExist= cartDAOImpl.getCartById(pid,userEmail);
		if(cartExist== null)
		{
			Cart cm=new Cart();
			cm.setCartPrice(price);
			cm.setCartProductID(pid);
			cm.setCartStock(qty);
			cm.setCartImage(imagName);
			cm.setCartProductName(pname);
			User u=userDAOImpl.findUserByEmail(userEmail);
			cm.setCartUserDetails(u);
			cartDAOImpl.insertCart(cm);
		}
		else if(cartExist !=null)
		{
			Cart cm=new Cart();
			cm.setCartId(cartExist.getCartId());
			cm.setCartPrice(price);
			cm.setCartProductID(pid);
			cm.setCartStock(cartExist.getCartStock()+qty);
			cm.setCartImage(imagName);
			cm.setCartProductName(pname);
			
			User u=userDAOImpl.findUserByEmail(userEmail);
			cm.setCartUserDetails(u);
			cartDAOImpl.updateCart(cm);
			
		}
		mv.addObject("cartInfo",cartDAOImpl.findByCartID(userEmail));
		mv.setViewName("cart");
		return mv;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		mv.addObject("cartInfo",cartDAOImpl.findByCartID(userEmail));
		mv.setViewName("cart");
		return mv;
	}
}

}
	


		
		
	
	


*/