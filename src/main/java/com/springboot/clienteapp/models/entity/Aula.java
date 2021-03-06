/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aguss
 */
@Entity
@Table(name="aulas")
public class Aula implements Serializable{
    
   private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    @Id
    private Long Id;
  
    private String Aula;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getAula() {
        return Aula;
    }
     
    public void setAula(String aula) {
        this.Aula =  aula;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + Id + ", aula=" + Aula + '}';
    }
    
    
    
    
}
