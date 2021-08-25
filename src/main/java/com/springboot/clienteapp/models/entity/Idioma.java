/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.entity;

import java.io.Serializable;
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
@Table(name="idioma")
public class Idioma implements Serializable {
    
  private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        private String idioma;

    public Long getIdIdioma() {
        return id;
    }

    public void setIdIdioma(Long idIdioma) {
        this.id = idIdioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

 
        
        
    
    
}
