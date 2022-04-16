/**
 * 
 */
package com.practice.userservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.userservice.entity.User;

/**
 * @author apaahuja
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	User findByUserId(Long userId);

}
