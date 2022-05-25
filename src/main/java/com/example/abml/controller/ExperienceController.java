/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.controller;

import com.example.abml.model.Experience;
import com.example.abml.service.IExperienceService;
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
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {

    @Autowired
    private IExperienceService iexp;

    @GetMapping("/experience")
    public List<Experience> getExp(){
	return iexp.getExp();
    }

    @GetMapping("/experience/{id}")
    public Experience getExpById(@PathVariable Long id){
	return iexp.findExp(id);
    }

    @PostMapping("/experience/create")
    public String postExp(@RequestBody Experience exp){
	iexp.saveExp(exp);
	return "Experiencia añadida";
    }

    @PutMapping("/experience/edit/{id}")
    public Experience editExp(@PathVariable Long id, @RequestParam ("job") String job){
	Experience exp = iexp.findExp(id);
	exp.setJob(job);
	iexp.saveExp(exp);
	return exp;
    }

    @DeleteMapping("/experience/delete/{id}")
    public String deleteExp(@PathVariable Long id){
	iexp.deleteExp(id);
	return "Registro " + id + " eliminado correctamente";
    }
    
}
