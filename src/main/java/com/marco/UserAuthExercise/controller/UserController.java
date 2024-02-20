package com.marco.UserAuthExercise.controller;

import com.marco.UserAuthExercise.entity.RegisterUserDto;
import com.marco.UserAuthExercise.domain.User;
import com.marco.UserAuthExercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.register(registerUserDto));
    }
}
