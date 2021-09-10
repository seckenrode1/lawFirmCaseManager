package org.sarahEckenrode.caseManager.services.services_impl;

import org.sarahEckenrode.caseManager.models.User;
import org.sarahEckenrode.caseManager.repositories.UserRepository;
import org.sarahEckenrode.caseManager.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	
	private UserRepository userRepository;
	
	@Autowired 
	public UserDetailServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found.");
		}
		return new CurrentUser(user);
	}

}
