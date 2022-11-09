package com.spa_project.service;

import java.util.List;

import com.spa_project.entity.Customer;
import com.spa_project.entity.Employee;
import com.spa_project.entity.Producer;
import com.spa_project.entity.Product;

public interface SAPServiceImpl {

	// Post and Get endPoints methods using inside SPAService class for business logic
	public void addCustomer(Customer customer);
	
	public void addEmployee(Employee employee);
	
	public void addProducer(Producer producer);
	
	public void addProduct(Product product);
	
	public List<Customer> getAllCustomer();
	
	public List<Employee> getAllEmployee();
	
	public List<Producer> getAllProducer();
	
	public List<Product> getAllProduct();
}
