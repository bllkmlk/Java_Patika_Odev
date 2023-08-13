package com.garantitech.gtbootcamp.repository;

import com.garantitech.gtbootcamp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AccountRepository extends JpaRepository<Account , Long> {
    List<Account> findAllByCustomerId(Long customerid);

}
