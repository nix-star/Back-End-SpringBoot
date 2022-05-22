/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.User;
import com.example.abml.repository.IUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author seba_
 */
@Service
public class UserService implements IUserService{
    
    @Autowired
    private IUserRepository userRepo;
    
    @Override
    public List<User> getUsers(){
	List<User> userList = userRepo.findAll();
	return userList;
    }

    @Override
    public void saveUser(User user){
	userRepo.save(user);
    }

    @Override
    public void deleteUser(Long id){
	userRepo.deleteById(id);
    }

    @Override
    public User findUser(Long id){
	User user = userRepo.findById(id).orElse(null);
	return user;
    }
}
