/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;


public class Perro {

    public String nombre;

    public Perro() {
        this.nombre = "Firulais";
    }
    
    public String toString(){
        return "Soy el perro "+this.nombre;
    }
}


class Rottweiler extends Perro{
    @Override
    public String toString(){
        return super.toString()+" y soy un Rotweiler";
    }
}