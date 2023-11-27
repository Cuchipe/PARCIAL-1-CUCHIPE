/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gato_perro;

/**
 *
 * @author usuario
 */
public class perro {
    String nombre;
    int edad;
    String raza;
  
    public perro(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        
    }
    public void comer(){
        System.out.println(this.nombre+"Empezo a comer ");
    }
    
     
    public void ladrar(){
        System.out.println(this.nombre+"Empezo a ladrar ");
    }
 
   
    public void jugar(){
        System.out.println(this.nombre+"Empezo a jugar ");
    }
    
    
}
