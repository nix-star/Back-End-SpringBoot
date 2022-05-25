/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.Skill;
import com.example.abml.repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author seba_
 */
@Service
public class SkillService implements ISkillService{

    @Autowired
    private ISkillRepository skillRepo;

    @Override
    public List<Skill> getSkills(){
	return skillRepo.findAll();
    }

    @Override
    public void saveSkill(Skill skill){
	skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id){
	skillRepo.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id){
	return skillRepo.findById(id).orElse(null);
    }
    
}
