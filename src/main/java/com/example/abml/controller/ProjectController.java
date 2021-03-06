/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.controller;

import com.example.abml.model.Project;
import com.example.abml.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seba_
 */
@RestController
@CrossOrigin(origins = {"https://ap-frontend-angular.firebaseapp.com",
			"https://ap-frontend-angular.web.app"})
public class ProjectController {

    @Autowired
    private IProjectService proser;
    
    @GetMapping("/api/project")
    public List<Project> getProjects(){
	return proser.getProjects();
    }

    @GetMapping("/api/project/{id}")
    public Project getProjectById(@PathVariable Long id){
	return proser.findProject(id);
    }

    @PostMapping("/api/project/create")
    public String createProject(@RequestBody Project project){
	proser.saveProject(project);
	return "Proyecto añadido al portafolio";
    }

    @DeleteMapping("/api/project/delete/{id}")
    public String deleteProject(@PathVariable Long id){
	proser.deleteProject(id);
	return "Proyecto elimminado del portafolio";
    }
}
