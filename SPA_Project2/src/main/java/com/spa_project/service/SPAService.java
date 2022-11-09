package com.spa_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spa_project.entity.Customer;
import com.spa_project.entity.Employee;
import com.spa_project.entity.Producer;
import com.spa_project.entity.Product;
import com.spa_project.repository.CustomerRepository;
import com.spa_project.repository.EmployeeRepository;
import com.spa_project.repository.ProducerRepository;
import com.spa_project.repository.ProductRepository;

@Service
public class SPAService implements SAPServiceImpl {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	ProducerRepository producerRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
	}
	@Override
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}
	@Override
	public void addProducer(Producer producer) {
		producerRepo.save(producer);
	}
	@Override
	public void addProduct(Product product) {
		productRepo.save(product);
	}
	@Override
	public List<Customer> getAllCustomer(){
		return customerRepo.findAll();
	}
	@Override
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	@Override
	public List<Producer> getAllProducer(){
		return producerRepo.findAll();
	}
	@Override
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}
}

