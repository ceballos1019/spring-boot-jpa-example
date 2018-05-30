/**
 * 
 */
package com.ibm.springbootjpa.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * @author andressanchez
 *
 */
@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public List<UserRecord> getAllUsers() {
		List<UserRecord> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}
	
	public Optional<UserRecord> getUser(String id) {
		return userRepository.findById(id);
	}
	
	public void addUser(UserRecord userRecord) {
		userRepository.save(userRecord);
	}
	
	public void delete(String id) {
		userRepository.deleteById(id);
	}
}
