/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.Experience;
import java.util.List;

/**
 *
 * @author seba_
 */
public interface IExperienceService {

    public List<Experience> getExp();
    public void saveExp(Experience exp);
    public void deleteExp(Long id);
    public Experience findExp(Long id);
    
}
