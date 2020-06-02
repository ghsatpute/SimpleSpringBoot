package com.ghsatpute.springboot.mappers;

import com.ghsatpute.springboot.dtos.PostUserDto;
import com.ghsatpute.springboot.dtos.UserDto;
import com.ghsatpute.springboot.entities.UserEntity;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends ConfigurableMapper {
    @Autowired
    private AddressMapper addressMapper;
    @Override protected void configure(MapperFactory factory) {
        factory.classMap(UserDto.class, UserEntity.class)
                .byDefault()
                .register();
        factory.classMap(PostUserDto.class, UserEntity.class)
                .byDefault()
                .register();
    }
}
