/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;


import com.springboot.clienteapp.models.entity.Aula;
import com.springboot.clienteapp.models.repository.AulaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author aguss
 */
@Service 
public class AulaServiceImplement implements IAulaService{

    @Autowired
    private AulaRepository aulaRepository;

    @Override
    public List<Aula> listarAula() {
        return (List<Aula>) aulaRepository.findAll();
    }

    @Override
    public void guardar(Aula aula) {
        aulaRepository.save(aula);
    }

    @Override
    public Aula buscarPorId(Long id) {
       return  aulaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        aulaRepository.deleteById(id);
    }
  
    
}
