package com.jerry.javad288.Controllers;

import com.jerry.javad288.Entities.Customer;
import com.jerry.javad288.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/customers")
public class AddCustomerController {

    private CustomerRepository customerRepository;

    @Autowired
    public AddCustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @PostMapping("/addcustomer")
    public void AddCustomer(@RequestBody Customer customer){

        customerRepository.save(customer);

    }

}
