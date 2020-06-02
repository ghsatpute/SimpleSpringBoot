package com.ghsatpute.springboot.mappers;

import com.ghsatpute.springboot.dtos.AddressDto;
import com.ghsatpute.springboot.entities.AddressEntity;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper extends ConfigurableMapper {
    @Override protected void configure(MapperFactory factory) {
        factory.classMap(AddressDto.class, AddressEntity.class)
                .byDefault();
    }
}
