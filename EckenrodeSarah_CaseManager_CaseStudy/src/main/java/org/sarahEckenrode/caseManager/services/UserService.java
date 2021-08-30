package org.sarahEckenrode.caseManager.services;

import java.util.List;

import org.sarahEckenrode.caseManager.models.User;

public interface UserService {
	User save(User user);
	User findById(Integer id);
	User findByUsername(String username);
	List<User> findAll();
	User updateUser(Integer userId, User user);
	void deleteByUserId(Integer userId);
}
