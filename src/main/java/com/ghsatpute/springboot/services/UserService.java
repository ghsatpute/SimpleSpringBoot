package com.ghsatpute.springboot.services;

import com.ghsatpute.springboot.dtos.PostUserDto;
import com.ghsatpute.springboot.dtos.UserDto;
import com.ghsatpute.springboot.entities.UserEntity;
import com.ghsatpute.springboot.mappers.UserMapper;
import com.ghsatpute.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;
    public List<UserDto> getUsers() {
        Iterable<UserEntity> users = userRepository.findAll();
        return userMapper.mapAsList(users, UserDto.class);
    }

    public Long postUsers(PostUserDto postUserDto) {
        UserEntity userEntity = userMapper.map(postUserDto, UserEntity.class);

        UserEntity saved = userRepository.save(userEntity);
        return saved.id;
    }
}
