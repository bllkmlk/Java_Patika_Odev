package com.garantitech.gtbootcamp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account {
    @Id
    private Long id;

    private Long customerId;

    private String ibanNo;

    private Long currentBalance;




}
