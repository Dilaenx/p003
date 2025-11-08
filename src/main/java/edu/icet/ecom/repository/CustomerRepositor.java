package edu.icet.ecom.repository;

import edu.icet.ecom.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositor extends JpaRepository<Customer,String> {
}
