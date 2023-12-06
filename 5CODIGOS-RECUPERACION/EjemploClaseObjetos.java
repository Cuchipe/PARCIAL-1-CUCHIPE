/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclaseobjetos;

/**
 *
 * @author usuario
 */
// Definición de una clase
class Persona {
    // Atributos
    String nombre;
    int edad;

    // Método constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método de instancia
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class EjemploClaseObjetos {
    public static void main(String[] args) {
        // Creación de objetos
        Persona persona1 = new Persona("Alice", 25);
        Persona persona2 = new Persona("Bob", 30);

        // Llamada a métodos
        persona1.saludar();
        persona2.saludar();
    }
}
