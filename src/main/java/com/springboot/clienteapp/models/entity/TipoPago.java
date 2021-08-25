/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.clienteapp.models.entity;

/**
 *
 * @author aguss
 */
public class TipoPago {

    public TipoPago(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
    private int id;
    private String tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
