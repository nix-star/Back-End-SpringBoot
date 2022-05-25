/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.abml.service;

import com.example.abml.model.Project;
import java.util.List;

/**
 *
 * @author seba_
 */
public interface IProjectService {

    public List<Project> getProjects();
    public void saveProject(Project project);
    public void deleteProject(Long id);
    public Project findProject(Long id);
    
}
