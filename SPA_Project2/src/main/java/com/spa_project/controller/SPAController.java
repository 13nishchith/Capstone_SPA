package com.spa_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spa_project.entity.Customer;
import com.spa_project.entity.Employee;
import com.spa_project.entity.Producer;
import com.spa_project.entity.Product;
import com.spa_project.service.SPAService;

@RestController
public class SPAController {
	
	@Autowired
	SPAService spaService;
	
	@PostMapping("/AddCustomer")
	public void createCustomer(@RequestBody Customer customer) {
		spaService.addCustomer(customer);
	}
	
	@PostMapping("/AddEmployee")
	public void createEmployee(@RequestBody Employee employee) {
		spaService.addEmployee(employee);
	}
	
	@PostMapping("/AddProducer")
	public void createProducer(@RequestBody Producer producer) {
		spaService.addProducer(producer);
	}
	
	@PostMapping("/AddProduct")
	public void createProduct(@RequestBody Product product) {
		spaService.addProduct(product);
	}
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/GetAllCustomer")
	public List<Customer> readAllCustomer(){
		return spaService.getAllCustomer();
	}
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/GetAllEmployee")
	public List<Employee> readAllEmployee(){
		return spaService.getAllEmployee();
	}
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/GetAllProducers")
	public List<Producer> readAllProducers(){
		return spaService.getAllProducer();
	}
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/GetAllProduct")
	public List<Product> readAllProduct(){
		return spaService.getAllProduct();
	}
}
