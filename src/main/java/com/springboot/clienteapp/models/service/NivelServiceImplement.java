/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Niveles;
import com.springboot.clienteapp.models.repository.NiveleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aguss
 */
@Service 
public class NivelServiceImplement implements INivelService {
    @Autowired
    private NiveleRepository niveleRepository;

    @Override
    public List<Niveles> listarNiveles() {
      return  (List<Niveles>) niveleRepository.findAll();
    }
    
}
