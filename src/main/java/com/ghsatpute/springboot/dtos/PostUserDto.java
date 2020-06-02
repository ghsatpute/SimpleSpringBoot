package com.ghsatpute.springboot.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;

public class PostUserDto {
    @NotBlank
    public String name;
    @NotNull
    public PostAddressDto address;
}
