package com.garantitech.gtbootcamp.controller;

import com.garantitech.gtbootcamp.entity.Customer;
import com.garantitech.gtbootcamp.service.CustomerServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerConroller {
    @Autowired
    private CustomerServicee customerService;

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {
        customerService.delete(customerId);
    }

    @GetMapping("/{customerId}")
    public Customer findById(@PathVariable Long customerId) {
        return CustomerServicee.findById(customerId);
    }

    @GetMapping("/identityNo/{identityNo}")
    public Customer findByIdentityNo(@PathVariable String identityNo) {
        Object id = 2;
        return customerService.findByIdentityNo(Long id);
    }
}
