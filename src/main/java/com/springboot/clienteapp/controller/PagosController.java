/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.controller;

import com.springboot.clienteapp.models.entity.Ciclos;
import com.springboot.clienteapp.models.entity.Horario;
import com.springboot.clienteapp.models.entity.Idioma;
import com.springboot.clienteapp.models.entity.Niveles;
import com.springboot.clienteapp.models.entity.Pagos;
import com.springboot.clienteapp.models.service.ICicloService;
import com.springboot.clienteapp.models.service.IHorarioService;
import com.springboot.clienteapp.models.service.IIdiomaService;
import com.springboot.clienteapp.models.service.INivelService;
import com.springboot.clienteapp.models.service.IPagosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aguss
 */

  @Controller 
  @RequestMapping("/views/Pagos")
public class PagosController {
      @Autowired
    private IPagosService pagoPagosservice;
     @Autowired
    private IIdiomaService idiomaService;
    @Autowired
    private IHorarioService horarioService;
    @Autowired
    private INivelService nivelService;
    @Autowired
    private ICicloService cicloService;
    
    
    //--- implementar metodo save()
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("titulo","REGISTRO DE PAGO");
        return "/views/Pagos/form";
    }
    
    
    
      
     @GetMapping("/create")
     public String crear(Model model){
         Pagos pago = new Pagos();
         List<Idioma> listIdiomas = idiomaService.listarIdiomas();
         List<Horario> listHorario = horarioService.listarHorario();
         List<Niveles> listNiveles = nivelService.listarNiveles();
         List<Ciclos> listCiclos = cicloService.listarCiclos();
         
         model.addAttribute("pago",pago);
         model.addAttribute("idiomas",listIdiomas);
         model.addAttribute("horario",listHorario);
         model.addAttribute("nivel",listNiveles);
         model.addAttribute("ciclo",listCiclos);
         
         
        return "/views/Pagos/form";
     }
      
      
      
}
