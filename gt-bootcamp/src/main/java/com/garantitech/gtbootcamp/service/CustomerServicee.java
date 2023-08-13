package com.garantitech.gtbootcamp.service;

import com.garantitech.gtbootcamp.entity.Customer;

public class CustomerServicee implements CustomerService{
    @Override
    public void save(Customer customer) {
        System.out.println("Hesap Açılmıştır ! ");
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void findById(Long id) {

    }

    @Override
    public void findByIdentityNo(Long id) {

    }
}
