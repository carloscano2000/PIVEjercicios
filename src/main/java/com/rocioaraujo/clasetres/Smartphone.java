/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocioaraujo.clasetres;

/**
 *
 * @author CDE-LAB3-PC32
 */
public class Smartphone extends Celular {
    //atributos
    private float pixelesCamara;
    private float tamanhoMemoriaInterna;
    private float tamanhoMemoriaExterna;
    
    //constructor
    public Smartphone (){
        
    }
    
    //constructor con los atributos de la clase, ademas de los heredados
    public Smartphone(String marca, String modelo, String color,float pixCamara, float memInterna, float memExterna) {
        super (marca,modelo,color);
        
        this.pixelesCamara = pixCamara;
        this.tamanhoMemoriaInterna = memInterna;
        this.tamanhoMemoriaExterna = memExterna;
        
    }
    
    @Override
    public void informarCaracteristicas (){
        super.informarCaracteristicas();
        System.out.println(String.format ("Smartphone calidad camara: %s pixeles",pixelesCamara)); 
        System.out.println(String.format ("Smartphone tamaño memoria interna: %s GB", tamanhoMemoriaInterna));
        System.out.println(String.format ("Smartphone tamaño memoria externa: %s GB", tamanhoMemoriaExterna));
        
        
    }
    
}
