/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gato_perro;

/**
 *
 * @author usuario
 */
public class Gato {
    String nombre;
    int edad;
    String raza;
  
    public Gato(String nonbre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        
    } 
    public void maullar(){
        System.out.println(this.nombre+"Empezo a maullar ");
    }
    
     
    public void saltar(){
        System.out.println(this.nombre+"Empezo a saltar ");
    }
 
    public void correr(){
        System.out.println(this.nombre+"Empezo a correr ");
    }
    
    
}
