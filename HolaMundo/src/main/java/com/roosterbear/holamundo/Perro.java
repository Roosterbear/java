/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;


public class Perro {

    public String nombre;

    public Perro() {
        this.nombre = "Jaime";
        
    }
    
    public Perro(String nombre){
        this();
        this.nombre+= " "+nombre;
    }
    
    public String toString(){
        return "Soy el perro "+this.nombre;
    }
}


