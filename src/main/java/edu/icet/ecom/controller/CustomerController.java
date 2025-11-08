package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    List<Customer> customerList = new ArrayList<>();
    @GetMapping("/getname")
    public String getName(){
        return "Dilaen";
    }
    @GetMapping("/getAllCustomer")
    public List<Customer> getCustomer(){
        customerList.add(new Customer("001","Dilaen",769759851,"kadwatha",25.0));
        customerList.add(new Customer("002","Dinuli",769759851,"Merigama",25.0));
        return customerList;
    }
    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        customerList.add(customer);
        return customer;
    }
}
