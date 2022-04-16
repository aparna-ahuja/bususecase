/**
 * 
 */
package com.practice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.userservice.Repository.UserRepository;
import com.practice.userservice.entity.User;
import com.practice.userservice.exception.DuplicateUserException;
import com.practice.userservice.exception.NoSuchUserException;

/**
 * @author apaahuja
 *
 */

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {

		if (userRepository.existsById(user.getUserId())) {
			throw new DuplicateUserException("Book : " + user.getEmail() + " is Already Exist");
		}
		return userRepository.save(user);

	}

	public User findUserById(Long userId) {
		User user = userRepository.findByUserId(userId);

		if (user == null) {
			throw new NoSuchUserException("User Id :" + userId + " does not exist to Display");
		}

		return userRepository.findByUserId(userId);
	}

	public String deleteUser(Long id) {

		User user = userRepository.findByUserId(id);

		if (user == null) {
			throw new NoSuchUserException("User Id :" + id + " does not exist to Delete");
		}

		userRepository.delete(user);

		return "UserId:  " + id + " deleted Successfully";

	}

	public User updateUser(User user) {

		User oldUser = userRepository.findByUserId(user.getUserId());

		if (oldUser == null) {
			throw new NoSuchUserException("User Id :" + user.getUserId() + " does not exist to update");
		}
		return userRepository.save(user);
	}

}
