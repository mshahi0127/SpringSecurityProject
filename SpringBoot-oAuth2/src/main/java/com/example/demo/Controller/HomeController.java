package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustomerData;

@RestController
@RequestMapping("api")
public class HomeController {

	 @GetMapping("/customer/{userId}")
	 public CustomerData getCustomerProfile(@PathVariable("userId") String userId) {
	  return getCustomer(userId);
	 }

	 private CustomerData getCustomer(final String userId) {
	  CustomerData customer = new CustomerData();
	  customer.setEmail("contact-us@javadevjournal.com");
	  customer.setFirstName("Demo");
	  customer.setLastName("User");
	  customer.setAge(21);
	  customer.setId(userId);
	  return customer;
	 }

}
