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
import com.springboot.clienteapp.models.entity.TipoPago;
import com.springboot.clienteapp.models.service.ICicloService;
import com.springboot.clienteapp.models.service.IHorarioService;
import com.springboot.clienteapp.models.service.IIdiomaService;
import com.springboot.clienteapp.models.service.INivelService;
import com.springboot.clienteapp.models.service.IPagosService;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        
          Pagos pago = new Pagos();
          TipoPago tipo = new TipoPago(1,"Multired");
          TipoPago tipo2 = new TipoPago(2,"Multired virtual");
          TipoPago tipo3 = new TipoPago(3,"Agenca Bancaria");
          List<TipoPago> listTipo = new ArrayList<TipoPago>();
          listTipo.add(tipo);
          listTipo.add(tipo2);
          listTipo.add(tipo3);
         List<Idioma> listIdiomas = idiomaService.listarIdiomas();
         List<Horario> listHorario = horarioService.listarHorario();
         List<Niveles> listNiveles = nivelService.listarNiveles();
         List<Ciclos> listCiclos = cicloService.listarCiclos();
        
         
         // -- cargar como lista 
           // -- LisTa pagos
         
         model.addAttribute("pago",pago);
         model.addAttribute("idiomas",listIdiomas);
         model.addAttribute("horario",listHorario);
         model.addAttribute("nivel",listNiveles);
         model.addAttribute("ciclo",listCiclos);
         model.addAttribute("listTipoP",listTipo);
         model.addAttribute("titulo","REGISTRO DE PAGO");
        return "/views/Pagos/form";
    }
    
                                       
    
      
     @PostMapping("/save")
     public String guardar(@ModelAttribute Pagos pago){
       pagoPagosservice.guardar(pago);
        return "redirect:/views/Pagos/";
     }
      
      @GetMapping("/showPagos")
     public String showPago(Model model){
         List<Pagos> listPagos = pagoPagosservice.listarPagos();
         model.addAttribute("listPago",listPagos);
      
         return "/views/Pagos/show";
     }
     
     
     
     
      
}
