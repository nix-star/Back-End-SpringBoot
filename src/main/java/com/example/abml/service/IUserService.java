/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.User;
import java.util.List;

/**
 *
 * @author seba_
 */
public interface IUserService {

    public List<User> getUsers();
    public void saveUser(User user);
    public void deleteUser(Long id);
    public User findUser(Long id);
}
