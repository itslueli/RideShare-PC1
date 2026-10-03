package com.example.ridesharepc1.Service;

import com.example.ridesharepc1.Model.User;
import com.example.ridesharepc1.Repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class UsersService {
    private UserRepository userRepository;

    public UserService(UserRepository usersRepository) {
        this.userRepository = usersRepository;
    }

    public Page<User> getAllUsers(Pageable pageable) {
        this.userRepository = userRepository;
    }



}