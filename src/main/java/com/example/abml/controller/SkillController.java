/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.controller;

import com.example.abml.model.Skill;
import com.example.abml.service.ISkillService;
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
public class SkillController {

    @Autowired
    private ISkillService iserv;

    @GetMapping("/api/skill")
    public List<Skill> getSkills(){
	return iserv.getSkills();
    }

    @GetMapping("/api/skill/{id}")
    public Skill getSkillById(@PathVariable Long id){
	return iserv.findSkill(id);
    }

    @PostMapping("/api/skill/create")
    public String createSkill(@RequestBody Skill skill){
	iserv.saveSkill(skill);
	return "Habilidad añadida correctamente";
    }

//    @PostMapping("/api/skill/create/multi")
//    public List<Skill> addSkills(@RequestBody List<Skill> skills){
//	for (Skill s: skills) iserv.saveSkill(s);
//	return iserv.getSkills();
//    }

    @DeleteMapping("/api/skill/delete/{id}")
    public String deleteSkill(@PathVariable Long id){
	iserv.deleteSkill(id);
	return "Habilidad borrada correctamente";
    }

    @PutMapping("/api/skill/edit/{id}")
    public Skill editSkill(@PathVariable Long id,
			   @RequestParam ("technology") String technology,
			   @RequestParam ("logo") String logo,
			   @RequestParam ("level") byte level){
	Skill skill = iserv.findSkill(id);
	skill.setTechnology(technology);
	skill.setLogo(logo);
	skill.setLevel(level);

	iserv.saveSkill(skill);
	return skill;
    }
    
}
