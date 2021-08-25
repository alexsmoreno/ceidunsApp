/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Pagos;
import com.springboot.clienteapp.models.repository.PagoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author aguss
 */
@Service 
public class PagosserviceImplements implements IPagosService {
    @Autowired
    private PagoRepository pagoRepository;
    
    @Override
    public List<Pagos> listarPagos() {
      return (List<Pagos>) pagoRepository.findAll();
    }

    @Override
    public void guardar(Pagos pagos) {
        pagoRepository.save(pagos);
    }
    
}
