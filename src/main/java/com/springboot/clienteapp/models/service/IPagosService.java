/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;

import com.springboot.clienteapp.models.entity.Pagos;
import java.util.List;

/**
 *
 * @author aguss
 */
public interface IPagosService {
    public List<Pagos> listarPagos();
    public void guardar(Pagos pagos);
}
