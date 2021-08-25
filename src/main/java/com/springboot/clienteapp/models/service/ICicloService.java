/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Ciclos;
import java.util.List;

/**
 *
 * @author aguss
 */
public interface ICicloService {
    public List<Ciclos> listarCiclos();
}
