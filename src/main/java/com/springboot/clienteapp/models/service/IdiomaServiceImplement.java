/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Idioma;
import com.springboot.clienteapp.models.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aguss
 */
@Service 
public class IdiomaServiceImplement implements  IIdiomaService{
    @Autowired
    private IdiomaRepository idiomaRepository;

    @Override
    public List<Idioma> listarIdiomas() {
       return (List<Idioma>) idiomaRepository.findAll();
    }
    
}
