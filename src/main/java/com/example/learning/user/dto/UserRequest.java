package com.example.learning.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class UserRequest {

@NotBlank(message = "First Name is Required")
private String firstName;

@NotBlank(message = "Middle Name is Required")
private String middleName;

@NotBlank(message = "Last Name is Required")
private String lastName;

@NotBlank(message = "Address is Required")
private String address;

}


