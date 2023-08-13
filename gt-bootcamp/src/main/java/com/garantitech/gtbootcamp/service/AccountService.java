package com.garantitech.gtbootcamp.service;
import com.garantitech.gtbootcamp.entity.Account;
import java.util.List;
public interface AccountService {
    List<Account> findAllByCustomerId(Long customerId);
    Account save(Account account);
    void delete(Long id);
    void withdrawMoney(String ibanNo, Double amount);
    void depositMoney(String ibanNo, Double amount);





}
