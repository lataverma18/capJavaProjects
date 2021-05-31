package com.example.security.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrinciple implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MyUser myUser;
	public UserPrinciple(MyUser myUser)
	{
		this.myUser=myUser;
	}
	
	public UserPrinciple()
	{
		
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		//[ROLE_USER,ROLE_ADMIN]
		return Arrays.stream(myUser.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		 //Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"),new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return myUser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return myUser.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
