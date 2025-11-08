package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService service;

    List<Customer> customerList = new ArrayList<>();
    @GetMapping("/getname")
    public String getName(){
        return "Dilaen";
    }
    @GetMapping("/getAllCustomer")
    public List<Customer> getCustomer(){

        return service.getAll();
    }
    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        customerList.add(customer);
        return customer;
    }
}
