package com.example.learning.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.user.dto.UserRequest;
import com.example.learning.user.dto.UserResponse;
import com.example.learning.user.model.User;
import com.example.learning.user.repository.UserRepository;

import jakarta.transaction.Transactional;


@Service 
@Transactional 
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

      public List<UserResponse> findAll() {
        List<User> users =userRepository.findAll();
        return users.stream().map(UserResponse::from).toList();
    }

    public UserResponse create(UserRequest userRequest) {

        User user = new User();

        return UserResponse.from(userRepository.save(user));
    }


}
