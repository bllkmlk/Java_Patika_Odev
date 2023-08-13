package com.garantitech.gtbootcamp.service;

import com.garantitech.gtbootcamp.entity.Account;

import java.util.List;

public class AccountServicee implements AccountService {

    @Override
    public List<Account> findAllByCustomerId(Long customerId) {
        return null;
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public void delete(Long id) {
        System.out.println("Hesabınız Kapanmıştır !");
    }

    @Override
    public static void withdrawMoney(String ibanNo, Double amount) {
        System.out.println(amount + "Miktarda Para Çekilmiştir !");
    }

    @Override
    public void depositMoney(String ibanNo, Double amount) {
        System.out.println(amount + "Miktarda Para Yatırılmıştır !");
    }

}
