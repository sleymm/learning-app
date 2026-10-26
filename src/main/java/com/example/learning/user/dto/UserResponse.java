package com.example.learning.user.dto;

import com.example.learning.user.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter   
@AllArgsConstructor 
public class UserResponse {
private Long id;
private String firstName;
private String middleName;
private String lastName;
private String address;


public static UserResponse from(User u) {
        return new UserResponse(u.getId(), u.getFirstName(), u.getMiddleName(), u.getLastName(), u.getAddress());
    }
}
