package com.garantitech.gtbootcamp.repository;

import com.garantitech.gtbootcamp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer ,Long> {
    List<Customer> findAllByEmail(String email);

}
