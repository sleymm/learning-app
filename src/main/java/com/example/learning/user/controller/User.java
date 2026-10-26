package com.example.learning.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.learning.user.dto.UserRequest;
import com.example.learning.user.dto.UserResponse;
import com.example.learning.user.services.UserService;

import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController 
@RequestMapping("/api/users")

public class User {
    private final UserService userService;
    public User(UserService userService)
    {
        this.userService=userService;

    }

    @GetMapping
    public List<UserResponse> list() {
            return userService.findAll();
        }

    // @Valid runs the rules in DepartmentRequest; failures become a 400 (see GlobalExceptionHandler).
    @PostMapping("/create")
    public ResponseEntity<UserResponse> create(@Valid @RequestBody UserRequest userRequest) {
        UserResponse created = userService.create(userRequest);

        // 201 Created, with a Location header pointing at the new record.
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(location).body(created);
    }
}
