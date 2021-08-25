/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Ciclos;
import com.springboot.clienteapp.models.repository.CicloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aguss
 */
@Service 
public class CicloServiceImplement  implements  ICicloService{
    @Autowired
    private CicloRepository cicloRepository;

    @Override
    public List<Ciclos> listarCiclos() {
       return (List<Ciclos>) cicloRepository.findAll();
    }
    
}
