package com.marco.UserAuthExercise.service;

import com.marco.UserAuthExercise.domain.User;
import com.marco.UserAuthExercise.entity.LoginUserDto;
import com.marco.UserAuthExercise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String login(LoginUserDto loginUserDto) {
        User user = userRepository.getUserByUsername(loginUserDto.getUsername());
        if(user == null) throw new RuntimeException();
        if(!user.getPassword().equals(loginUserDto.getPassword())) throw new RuntimeException();

        return "Logged in.";
    }
}
