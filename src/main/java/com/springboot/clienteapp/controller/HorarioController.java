/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.controller;



import com.springboot.clienteapp.models.entity.Horario;
import com.springboot.clienteapp.models.service.HorarioServiceImplement;
import com.springboot.clienteapp.models.service.IHorarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aguss
 */

  @Controller 
  @RequestMapping("/views/horario")
public class HorarioController {
      @Autowired
      private IHorarioService horarioRepository;
    
      @GetMapping("/")
      public  String getHorario(Model model){
       List<Horario> listaHorario = horarioRepository.listarHorario();
        model.addAttribute("titulo","Lista Horario");
        model.addAttribute("listHorario",listaHorario);
       return "/views/horario/show";
    }
    
      @GetMapping("/create")
      public String crearHorario(Model model){
       Horario horario = new Horario();
        model.addAttribute("titulo","Formulario Nuevo Horario");
        model.addAttribute("horario",horario);
        return "/views/horario/form";
    }
      
     @PostMapping("/save")
     public String guardar(@ModelAttribute Horario horario){
       horarioRepository.guardar(horario);
       System.out.println("Horario guardado con exito");      
     	return "redirect:/views/horario/";
    }
    
    @GetMapping("/edit/{id}")
    public String editar(@PathVariable("id") Long idHorario,Model model){
        Horario horario = horarioRepository.buscarPorId(idHorario);
        model.addAttribute("titulo","Formulario Editar Horario");
        model.addAttribute("horario",horario);
         return "/views/horario/form";
        
       
    } 
      
    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") Long idhorario){
        horarioRepository.eliminar(idhorario);
        return "redirect:/views/horario/";
    }
    
    
    
    
}
