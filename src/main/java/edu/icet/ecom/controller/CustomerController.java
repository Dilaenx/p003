package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    List<Customer> customerList = new ArrayList<>();
   // @GetMapping
    public String getName(){
        return "Dilaen";
    }
    @GetMapping
    public List<Customer> getCustomer(){
        customerList.add(new Customer("001","Dilaen",769759851,"kadwatha",25.0));
        customerList.add(new Customer("002","Dinuli",769759851,"Merigama",25.0));
        return customerList;
    }
}
