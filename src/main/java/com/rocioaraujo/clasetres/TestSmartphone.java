/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocioaraujo.clasetres;

/**
 *
 * @author CDE-LAB3-PC32
 */
public class TestSmartphone {
   
    public static void main (String []args){
        //Crea un objeto de tipo Smartphone
        Smartphone smart = new Smartphone ();
        
        //Asignamos marca, modelo, color, pixeles camara, tamaño memoria interna y externa
        
        smart.setMarca("Samsung");
        smart.setModelo("S9 Plus");
        smart.setColor("Negro");
        smart.setPixelesCamara(20);
        smart.setTamanhoMemoriaInterna(128);
        smart.setTamanhoMemoriaExterna(64);
        
        //Utilizamos los metodos; llamar, cortar llamada de la clase celular
        
        smart.llamar("Jefe");
        smart.cortarLlamada();
        
        System.out.println();
        
        //Metodo sobrescrito
        smart.informarCaracteristicas();
     
    }
}
