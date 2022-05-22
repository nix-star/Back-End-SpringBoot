/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.controller;

import com.example.abml.model.User;
import com.example.abml.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seba_
 */

@RestController
public class UserController {

    @Autowired
    private IUserService ius;
    
    @GetMapping("/user")
    public List<User> getUsers(){
	return ius.getUsers();
    }
    
}
