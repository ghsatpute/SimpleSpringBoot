package com.ghsatpute.springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    public UserEntity user;

    public String addressLine1;
    public String getAddressLine2;
    public Integer zipCode;
}
