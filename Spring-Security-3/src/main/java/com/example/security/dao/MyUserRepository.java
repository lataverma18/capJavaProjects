package com.example.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.model.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer>{

	MyUser findMyUserByName(String name);
}
