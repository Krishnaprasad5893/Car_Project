package com.example.demo.services;
import java.util.*;
import com.example.demo.model.Customer;
public class CustomerService {
	private List<Customer> custList;
	public CustomerService() {
		super();
		// TODO Auto-generated constructor stub
		custList=new ArrayList<Customer>();
		
	}
	private void init() {
		this.custList.add(new Customer(101,"Suresh",2884));
		this.custList.add(new Customer(102,"Sumesh",3774));
		
	}
	public boolean add(Customer cust) {
		
		return this.custList.add(cust);
	}
	public List<Customer> getAllCustomer(){
		init();
		return this.custList;
	}
	

}
