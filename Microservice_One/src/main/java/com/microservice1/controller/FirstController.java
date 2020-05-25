package com.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice1.dto.CustTabledto;
import com.microservice1.entity.Customer;
import com.microservice1.repository.CustomerRepository;

@RestController
public class FirstController {
@Autowired
CustomerRepository custRepo;

	@GetMapping("/health")
	public String gethealth() {
		return "All OK";
	}

	
@PostMapping("/createCust")
public Customer createCustomer(@RequestBody CustTabledto custTabledto) {
		
		Customer cust=new Customer();
		cust.setId(custTabledto.getId());
		cust.setColor(custTabledto.getColor());
		cust.setName(custTabledto.getName());
		cust.setParentId(custTabledto.getParentId());
		System.out.println("custtableDto: "+custTabledto);
		System.out.println("cust: "+cust);
		Customer custupdated=custRepo.save(cust);
		return custupdated;
	}

}
