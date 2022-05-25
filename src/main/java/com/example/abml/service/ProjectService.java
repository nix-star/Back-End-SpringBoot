/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.Project;
import com.example.abml.repository.IProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author seba_
 */
@Service
public class ProjectService implements IProjectService{

    @Autowired
    private IProjectRepository proRepo;

    @Override
    public List<Project> getProjects(){
	return proRepo.findAll();
    }

    @Override
    public void saveProject(Project project){
	proRepo.save(project);
    }

    @Override
    public void deleteProject(Long id){
	proRepo.deleteById(id);
    }

    @Override
    public Project findProject(Long id){
	return proRepo.findById(id).orElse(null);
    }
    
}
