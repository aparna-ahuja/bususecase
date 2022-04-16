/**
 * 
 */
package com.practice.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author apaahuja
 *
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@NotNull(message="First Name Required")
	@Pattern(regexp = "^[a-zA-Z]+$",message="provide valid name: ex. Aparna")
	private String firstName;
	
	private String lastName;
	
	@NotNull(message="age is Required")
	private int age;
	
	@NotNull(message="gender is Required")
	private String gender;
	
	
	@NotNull(message="email  is Required")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="provide valid name: ex. abc@xyz.com")
	private String email;
	
	@NotNull(message="contact number is Required")
	//@Pattern(regexp = "^[0-9]{10}$", message= "Provide Valid Phone Number with 10 numbers")
	private long contactNumber;
	
	@NotNull(message="password is Required")
	@Pattern(regexp = "^[A-Za-z0-9]{6,}$",message="At least six characters long contains a lowercase letter,Uppercase letetr and a number")
	private String password;
	
	
	
	
	
	

}
