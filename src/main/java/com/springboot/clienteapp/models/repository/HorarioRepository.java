/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.repository;

import com.springboot.clienteapp.models.entity.Horario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author aguss
 */
public interface HorarioRepository extends CrudRepository<Horario,Long>{
    
}
