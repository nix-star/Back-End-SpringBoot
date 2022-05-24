/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abml.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author seba_
 */
@Entity
@Getter @Setter
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String job;

}
