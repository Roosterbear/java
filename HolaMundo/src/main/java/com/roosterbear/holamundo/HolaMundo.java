/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;

public class HolaMundo {
    static int i = 5;
    public static void main(String args[]) {
       Perro perro = new Perro();
        cambiaPerro(perro);
        System.out.println("i = " + i);
        cambiarVariable(i);
        System.out.println("i = " + i);
    }
    
    public static void cambiaPerro(Perro p){
        p.decirNombre();
    
    }

    private static void cambiarVariable(int i) {
        i = 3;
    }
}
