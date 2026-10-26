package com.example.learning.user.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Entity 
@Table(name="learning_users")
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor  
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) // the database picks the id: 1, 2, 3...
private Long id;
 
@Column(name="first_name", nullable = false, length = 25)
private String firstName;


@Column(name="middle_name", nullable = false, length = 25)
private  String middleName;


@Column(name="last_name", nullable = false, length = 25)
private String lastName;

@Column(name="address", nullable = false, length = 25)
private String address;
    
}
