/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;

public class HolaMundo {
    
    public static String nombreCambiado = "Fido";
    
    public static void main(String args[]){
        Perro p = new Perro();
        
        System.out.println("La suma es: "+suma(1,2));
        System.out.println("Vamos a nombrar Fido al perro... ");
        
        cambiarNombreAlPerro(p);
    }
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    public static void cambiarNombreAlPerro(Perro p){
        p.nombre = nombreCambiado;
        System.out.println(p.decirNombre());
    }    
    
}
