/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.Experience;
import com.example.abml.repository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author seba_
 */
@Service
public class ExperienceService implements IExperienceService{

    @Autowired
    private IExperienceRepository expRepo;

    @Override
    public List<Experience> getExp(){
	return expRepo.findAll();
    }

    @Override
    public void saveExp(Experience exp){
	expRepo.save(exp);
    }

    @Override
    public void deleteExp(Long id){
	expRepo.deleteById(id);
    }

    @Override
    public Experience findExp(Long id){
	return expRepo.findById(id).orElse(null);
    }
    
}
