/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;

public class HolaMundo {

    public static void main(String args[]) {
       Persona p = new Persona();
        System.out.println(p);
       
    }
}

class Persona{
    private String _nombre = "Jacinto";
    private String _apellido = "Perez";
    private int _id = 123;
    private double _sueldo = 60000;
    private boolean _casado = false;

    @Override
    public String toString() {
        return "Persona{" + "_nombre=" + _nombre + ", _apellido=" + _apellido + ", _id=" + _id + ", _sueldo=" + _sueldo + ", _casado=" + _casado + '}';
    }
    
    
}