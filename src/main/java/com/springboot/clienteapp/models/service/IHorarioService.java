/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.service;


import com.springboot.clienteapp.models.entity.Horario;
import java.util.List;

/**
 *
 * @author aguss
 */
public interface IHorarioService {
    
    public List<Horario> listarHorario();
    public void guardar(Horario horario);
    public Horario buscarPorId(Long id);
    public  void eliminar (Long id);
    
}
