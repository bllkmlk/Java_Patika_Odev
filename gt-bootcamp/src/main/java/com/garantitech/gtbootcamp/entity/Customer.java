package com.garantitech.gtbootcamp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {

    @Id
    private Long id;

    private String name;

    private String surname;

    private Long identityNo;

    private Long password;

    private String phoneNumber;

    private String email;


}
