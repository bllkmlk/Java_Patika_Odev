package com.garantitech.gtbootcamp.service;

import com.garantitech.gtbootcamp.entity.Customer;

public interface CustomerService {
    void save(Customer customer);

    void delete(Customer customer);

    void findById(Long id);

    void findByIdentityNo(Long id);
}
