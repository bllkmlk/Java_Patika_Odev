package com.garantitech.gtbootcamp.controller;

import com.garantitech.gtbootcamp.entity.Account;
import com.garantitech.gtbootcamp.service.AccountService;
import com.garantitech.gtbootcamp.service.AccountServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
    @Autowired
    private AccountServicee accountServicee;

    @PostMapping
    public Account saveAccount(@RequestBody Account account) {
        return accountServicee.save(account);
    }

    @DeleteMapping("/{Id}")
    public void deleteAccount(@PathVariable Long accountId) {
        accountServicee.(accountId);
    }

    @GetMapping("/customer/{customerId}")
    public List<Account> findAllAccountsByCustomerId(@PathVariable Long customerId) {
        return AccountServicee.findAllByCustomerId(customerId);
    }

    @PostMapping("/{amount}")
    public Account withdrawMoney(@PathVariable Long accountId, @PathVariable double amount) {
        return AccountServicee.withdrawMoney(accountId, amount);
    }

    @PostMapping("/{amount}")
    public Account depositMoney(@PathVariable Long accountId, @PathVariable double amount) {
        return AccountServicee.depositMoney(accountId, amount);
    }

}
