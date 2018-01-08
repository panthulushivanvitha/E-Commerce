package com.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dao.CategoryDAO;
import com.dao.ProductDAO;
import com.dao.SupplierDAO;


import com.dao.UserDAO;
import com.daoimpl.CategoryDAOImpl;
import com.daoimpl.ProductDAOImpl;
import com.daoimpl.SupplierDAOImpl;

import com.daoimpl.UserDAOImpl;
import com.model.Category;
import com.model.Product;
import com.model.Supplier;

import com.model.User;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class HiberConfig {
	@Autowired
	@Bean(name="datasource")
public DataSource getH2Data()
{
	DriverManagerDataSource dsource=new DriverManagerDataSource();
	dsource.setDriverClassName("org.h2.Driver");
	dsource.setUrl("jdbc:h2:tcp://localhost/~/HOMEDECORS1backend");
	dsource.setUsername("sa");
	dsource.setPassword("");
	System.out.println("H2 connected");
	return dsource;
 }
private Properties getHiber()
{
	Properties p= new Properties();
	p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");//hibernate knows what kind of lang is to be use to talk to  DBC
	p.put("hibernate.hbm2ddl.auto","update");
	p.put("hibernate.show_sql","true");
	System.out.println("Hibernate Config");
	return p;
}
    @Autowired
    @Bean(name="sessionFactory")
    public SessionFactory getHibersession(DataSource datasource)
    {
    	LocalSessionFactoryBuilder lsfb= new LocalSessionFactoryBuilder(datasource);
    	lsfb.addProperties(getHiber());
    	lsfb.addAnnotatedClass(User.class);// mapping classes mapping model objects
    	lsfb.addAnnotatedClass(Supplier.class);
    	lsfb.addAnnotatedClass(Category.class);
    	lsfb.addAnnotatedClass(Product.class);
    	return lsfb.buildSessionFactory();
    }
    
    
    @Autowired
    @Bean(name="transactionManager")
    public HibernateTransactionManager getTrans(SessionFactory sessionFactory)
    {
    HibernateTransactionManager tm= new HibernateTransactionManager(sessionFactory);
    return tm;
    }   
   
    
    @Autowired
    @Bean(name="userDAO")
    public UserDAO saveUserData(SessionFactory sessionFactory)
    {
    	return new UserDAOImpl(sessionFactory);
    }
    
    @Autowired
    @Bean(name="supplierDAO")
    public SupplierDAO  saveSupplierData(SessionFactory sessionFactory)
    {
    	return new SupplierDAOImpl(sessionFactory);
    }
    
    @Autowired
    @Bean(name="categoryDAO")
    public CategoryDAO saveCategoryData(SessionFactory sessionFactory)
    {
    	return new CategoryDAOImpl(sessionFactory);
    }
 
    @Autowired
    @Bean(name="ProductDAO")
    public ProductDAO saveProdData(SessionFactory sessionFactory)
    {
    	return new ProductDAOImpl(sessionFactory);
    }
}

