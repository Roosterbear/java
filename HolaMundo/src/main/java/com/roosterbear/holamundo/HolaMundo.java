/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roosterbear.holamundo;

public class HolaMundo {
    public static void main(String args[]){
        Cerveza c = new Cerveza("Heineken"); 
    }
}


class Cerveza{
    String marca;
    
    Cerveza(String marca){
        this.marca = marca;
        Tomar t = new Tomar();
        t.tomar(this);
    }
}

// Solo una clase puede ser public !
class Tomar{
    String estado = "Estoy tomando cerveza";
    
    public void tomar(Cerveza c){
        System.out.println("Esto: "+this.estado);
        System.out.println("Objeto: "+c.marca);
        
    }
}
