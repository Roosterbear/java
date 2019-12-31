/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;

public class HolaMundo {
    
    public static void main(String args[]) {
        Gremlin g1  = new Gremlin();
        System.out.println(g1);
        Gremlin g2  = new Gremlin();
        System.out.println(g2);
        Gremlin g3  = new Gremlin();
        System.out.println(g3);
       
    }
}

class Gremlin{
    private static int contador;
    Gremlin(){
       Gremlin.contador++; 
    }

    @Override
    public String toString() {
        return "Creando el gremlin No. "+Gremlin.contador;
    }
    
    
}

