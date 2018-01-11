/*package com.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CartDAO;
import com.model.Cart;
import com.model.Product;
@Repository("CartDAOImpl")
public class CartDAOImpl implements CartDAO
{
@Autowired
SessionFactory sessionFactory;
public CartDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
    public void insert(Cart cart) {
    	Session session=sessionFactory.openSession();
    	session.beginTransaction();
    	session.persist(cart);
        session.getTransaction().commit();
	}

	public Product findByCartID(int userId) {
	Session session=sessionFactory.openSession();
	List<Cart> cr=null;
	try{
		session.beginTransaction();
		cr=(List<Cart>)session.createQuery("from Cart where userMaiId=: email").setString(userId,"email").List();)
	
		}
	catch(HibernateException e)
	{
		e.printStackTrace();
		session.getTransaction().rollback();
	}
	
	return cr;
}
}


*/