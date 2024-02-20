package com.marco.UserAuthExercise.controller;

import com.marco.UserAuthExercise.entity.LoginUserDto;
import com.marco.UserAuthExercise.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    public AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginUserDto loginUserDto) {
        return authService.login(loginUserDto);
    }
}
