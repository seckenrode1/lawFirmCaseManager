package org.sarahEckenrode.caseManager.services.services_impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.sarahEckenrode.caseManager.models.User;
import org.sarahEckenrode.caseManager.repositories.UserRepository;
import org.sarahEckenrode.caseManager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	
	private UserRepository userRepository;
	private PasswordEncoder pswrdEncoder;

	@Autowired
	public UserServiceImpl(UserRepository userRepository, PasswordEncoder pswrdEncoder) {
		this.userRepository = userRepository;
		this.pswrdEncoder = pswrdEncoder;
	}
	
	
	@Override
	public User save(User user) {
		user.setPassword(pswrdEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public User findById(Integer id) {
		Optional<User> optUser = userRepository.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}
		throw new EntityNotFoundException();
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}
	
	@Override
	public User updateUser(Integer userId, User user) {
		User u = userRepository.findByUserId(userId);
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setStaffFirstName(user.getStaffFirstName());
		u.setStaffLastName(user.getStaffLastName());
		u.setStaffEmail(user.getStaffEmail());
		u.setUserRole(user.getUserRole());
		return userRepository.save(u);
	}
	
	@Override
	public void deleteByUserId(Integer userId) {
		userRepository.deleteById(userId);
	}

}
