package com.example.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.dao.MyUserRepository;
import com.example.security.model.MyUser;
import com.example.security.model.UserPrinciple;

@Service
public class MyUserService implements UserDetailsService {
	@Autowired
	MyUserRepository myUserRepository; 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MyUser myUser=myUserRepository.findMyUserByName(username);
		return new UserPrinciple(myUser);
	}
}
