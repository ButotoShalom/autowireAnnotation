package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;

@Service
public class CustomerService {
	private static List<Customer> list =new  ArrayList<Customer>();
	

	static {
		Customer c = new Customer();
		c.setId(1L);
		c.setName("Customer 1");
		c.setAge(28L);
		c.setLocation("Burundi");
		list.add(c);
		
		c = new Customer();
		c.setId(1L);
		c.setName("Customer 2");
		c.setAge(28L);
		c.setLocation("Burundi");
		list.add(c);
		
		c = new Customer();
		c.setId(1L);
		c.setName("Customer 3");
		c.setAge(28L);
		c.setLocation("Burundi");
		list.add(c);
	}
	
	public List<Customer> getList(){
		return list;
	}
}
