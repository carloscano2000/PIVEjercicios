/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocioaraujo.clasetres;

/**
 *
 * @author CDE-LAB3-PC32
 */
public class TestCelular {
    public static void main (String [] args){
        //Creamos un nuevo objeto de tipo celular , con el constructor vacio
        Celular cel = new Celular();
        //asignamos marca, modelo y color
        cel.setMarca("Apple");
        cel.setModelo("iphone 14 PRO Max");
        cel.setColor("Negro");
        //utilizacion de metodos: llamar, cortarLlamada  e informarCaracteristicas
        cel.llamar("Jefe");
        cel.cortarLlamada();
        System.out.println();
        cel.informarCaracteristicas();
    }
    
}
