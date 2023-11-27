/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author usuario
 */
public class persona {
    String nombre;
    int edad;
    
    public persona(String nombre,int edad){
    this.nombre=nombre;
    this.edad=edad;
    }
 
 public void correr(){
    
     System.out.println(this.nombre+ "  Empezo a correr");
 }
    
}
