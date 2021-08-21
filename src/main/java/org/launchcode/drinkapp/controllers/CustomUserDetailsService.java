package org.launchcode.drinkapp.controllers;


import org.launchcode.drinkapp.models.User;
import org.launchcode.drinkapp.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userRepo.findByEmail(username);
		if (null == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return null;
	}

}
