package com.ghsatpute.springboot.controllers;

import com.ghsatpute.springboot.dtos.PostUserDto;
import com.ghsatpute.springboot.dtos.UserDto;
import com.ghsatpute.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        List<UserDto> users = userService.getUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Long> postUsers(
            @Valid @RequestBody PostUserDto postUserDto) {

        Long userId = userService.postUsers(postUserDto);
        return new ResponseEntity<>(userId, HttpStatus.CREATED);
    }
}
