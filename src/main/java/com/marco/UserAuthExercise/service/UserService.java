package com.marco.UserAuthExercise.service;

import com.marco.UserAuthExercise.domain.User;
import com.marco.UserAuthExercise.entity.RegisterUserDto;
import com.marco.UserAuthExercise.repository.UserRepository;
import com.marco.UserAuthExercise.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(RegisterUserDto registerUserDto) {
        User user = new User(registerUserDto.getUsername(), registerUserDto.getPassword(), Role.USER);
        userRepository.save(user);

        return user;
    }
}
