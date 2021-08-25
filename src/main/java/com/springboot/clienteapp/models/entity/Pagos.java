/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author aguss
 */

@Entity
@Table(name="pagos")
public class Pagos implements Serializable{
    
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String correo;
    private String codigoEstudiante;
    private String edad;
    // -- Datos de pago
    private String fechaPago;
    private String horaOperacion;
    private String numeroOperacion;
    private String montoPago;
    private String tipoPago;
    private String personaPago;
    private String perosnaDNI;
    
     // -- relaciones
    
    @ManyToOne
    @JoinColumn(name = "idioma_id")
    private Idioma idioma; 
     @ManyToOne
    @JoinColumn(name = "nivel_id")
    private Niveles niveles;
      @ManyToOne
    @JoinColumn(name = "ciclo_id")
    private Ciclos ciclos;
       @ManyToOne
    @JoinColumn(name = "horario_id")
    private Horario horario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getHoraOperacion() {
        return horaOperacion;
    }

    public void setHoraOperacion(String horaOperacion) {
        this.horaOperacion = horaOperacion;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public String getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        String tipo="";
        if(tipoPago.equals("1")){
            tipo ="Multired";
        }else if(tipoPago.equals("2")){
           tipo ="Multired Virtual"; 
        }else if(tipoPago.equals("3")){
            tipo ="Agencia Bancaria"; 
        }
        this.tipoPago = tipo;
    }

    public String getPersonaPago() {
        return personaPago;
    }

    public void setPersonaPago(String personaPago) {
        this.personaPago = personaPago;
    }

    public String getPerosnaDNI() {
        return perosnaDNI;
    }

    public void setPerosnaDNI(String perosnaDNI) {
        this.perosnaDNI = perosnaDNI;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Niveles getNiveles() {
        return niveles;
    }

    public void setNiveles(Niveles niveles) {
        this.niveles = niveles;
    }

    public Ciclos getCiclos() {
        return ciclos;
    }

    public void setCiclos(Ciclos ciclos) {
        this.ciclos = ciclos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    

    
    
}
