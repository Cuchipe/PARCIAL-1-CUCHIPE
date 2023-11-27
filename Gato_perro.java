/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gato_perro;

/**
 *
 * @author usuario
 */
public class Gato_perro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Gato gato1 = new Gato("dino ", 18,"budgol");
        gato1.maullar();
        gato1.saltar();
        gato1.correr(); 
        
        perro perro1 =new perro ("dino ", 18,"budgol");
        perro1.comer();
        perro1.ladrar();
        perro1.jugar();
// TODO code application logic here
    }
    
}
