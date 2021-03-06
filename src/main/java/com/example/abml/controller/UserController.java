/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.controller;

import com.example.abml.model.User;
import com.example.abml.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seba_
 */

@RestController
@CrossOrigin(origins = {"https://ap-frontend-angular.firebaseapp.com",
			"https://ap-frontend-angular.web.app"})
public class UserController {

    @Autowired
    private IUserService ius;
    
    @GetMapping("/api/user")
    public List<User> getUsers(){
	return ius.getUsers();
    }

    @GetMapping("/api/user/{id}")
    public User getUserById(@PathVariable Long id){
	return ius.findUser(id);
    }

    @PostMapping ("/api/user/create")
    public String createStudent(@RequestBody User user){
	ius.saveUser(user);
	return "Usuario creado correctamente";
    }

//    @DeleteMapping ("/api/user/delete/{id}")
//    public String deletePersona(@PathVariable Long id){
//	ius.deleteUser(id);
//	return "Usuario eliminado correctamente";
//    }

    @PutMapping ("/api/user/edit/{id}")
    public User editPersona (@PathVariable Long id,
				@RequestParam ("name") String name,
				@RequestParam ("user") String user,
				@RequestParam ("password") String pass,
				@RequestParam ("profesion") String profesion,
				@RequestParam ("img") String img,
				@RequestParam ("active") boolean active){

	User myuser = ius.findUser(id);

	myuser.setName(name);
	myuser.setUser(user);
	myuser.setPassword(pass);
	myuser.setProfesion(profesion);
	myuser.setImg(img);
	myuser.setActive(active);

	ius.saveUser(myuser);
	return myuser;
    }
}
