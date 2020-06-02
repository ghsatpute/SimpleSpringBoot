package com.ghsatpute.springboot.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    @OneToOne(cascade = CascadeType.ALL)
    public AddressEntity address;

    public String name;
}
