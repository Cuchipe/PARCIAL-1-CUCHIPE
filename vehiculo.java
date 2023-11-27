/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author usuario
 */
public class vehiculo {
    String modelo;// atributo
    int ano;
    
    public vehiculo(String modelo,int ano){
    this.modelo=modelo;
    this.ano=ano;
            }
public void correr(int velocidad){
    
    int velociadad=velocidad;
    if(velocidad>50){
        System.out.println(this.modelo+" "+this.ano+" multado");
    
    }
    if(velocidad<50){
        System.out.println(this.modelo+" "+this.ano+" no multado");
    
    }
    }
   }
