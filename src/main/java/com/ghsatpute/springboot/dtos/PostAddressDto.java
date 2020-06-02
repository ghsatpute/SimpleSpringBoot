package com.ghsatpute.springboot.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.Min;

public class PostAddressDto {
    @NotNull
    public String addressLine1;

    public String getAddressLine2;
    @Min(1000)
    public Integer zipCode;
}
