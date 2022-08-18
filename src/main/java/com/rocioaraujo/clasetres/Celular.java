/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocioaraujo.clasetres;

/**
 *
 * @author CDE-LAB3-PC32
 */
public class Celular {
    //Atributos de la clase
    private String marca;
    private String modelo;
    private String color;
    
    //constructor vacio
    public Celular(){
        
    }
    
    //constructor con parametros
    public Celular(String mar, String model, String col){
        this.marca = mar;
        this.modelo = model;
        this.color = col;
        
    }
    
    //metodo hacer llamada
    public void llamar(String nombre){
        System.out.println("Llamando a" + nombre);
    }
    
    //metodo para finalizar llamada
    public void cortarLlamada(){
        System.out.println ("Llamada finalizada");
    }
    
    //metodo informar caracteristicas del celular
    public void informarCaracteristicas(){
        System.out.println(String.format("Celular Marca: %s", marca));
        System.out.println(String.format("Celular Modelo: %s", modelo));
        System.out.println(String.format("Celular Color: %s", color));
        
    }
    
    //getters y setters
    public String getMarca(){
        return marca;
    }
    public void setMarca(String mar){
        this.marca = mar;
    }
    
    public String getModelo (){
        return modelo;
    }
    
    public void setModelo (String model){
        this.modelo = model;
    }
     public String getColor (){
        return color;
    }
    
    public void setColor (String col){
        this.color = col;
    }
           
}

