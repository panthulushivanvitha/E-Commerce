/*package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Orders implements Serializable 
{
	@Id
	@GeneratedValue
	private int orderId;
	@ManyToOne
	@JoinColumn
	private User user;
	private String payment;
	
	

}
*/