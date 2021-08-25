/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.controller;



import com.springboot.clienteapp.models.entity.Aula;
import com.springboot.clienteapp.models.service.AulaServiceImplement;
import com.springboot.clienteapp.models.service.IAulaService;
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
  @RequestMapping("/views/aulas")
public class AulasController {
    
    @Autowired
    private  IAulaService aulaService;
    @GetMapping("/")
    public  String getAula(Model model){
        List<Aula> listadoAula = aulaService.listarAula();
        model.addAttribute("titulo","Lista De Aulas");
        model.addAttribute("lisAulas",listadoAula);
       return "/views/aulas/listar";
 
    }
       @GetMapping("/create")
    public String crearAula(Model model){
        Aula aula = new Aula();
        model.addAttribute("titulo","Formulario Nueva Aula");
        model.addAttribute("aula",aula);
        return "/views/aulas/formCreate";
    }
    
    @PostMapping("/save")
    public String guardar(@ModelAttribute Aula aula){
      aulaService.guardar(aula);
       System.out.println("Aula Guardada con exito");      
     	return "redirect:/views/aulas/";
    }
    
    
    @GetMapping("/edit/{id}")
    public String editar(@PathVariable("id") Long idAula,Model model){
        Aula aula = aulaService.buscarPorId(idAula);
        model.addAttribute("titulo","Formulario Editar Aula");
        model.addAttribute("aula",aula);
        return "/views/aulas/formCreate";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") Long idAula){
        aulaService.eliminar(idAula);
        return "redirect:/views/aulas/";
    }
    
    
}
