/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploclaseobjetos;

/**
 *
 * @author usuario
 */
// Clase base
class Animal {
    void comer() {
        System.out.println("El animal come.");
    }
}

// Clase derivada (subclase)
class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro ladra.");
    }
}

public class EjemploHerencia {
    public static void main(String[] args) {
        // Creación de objeto de la subclase
        Perro miPerro = new Perro();

        // Llamada a métodos de ambas clases
        miPerro.comer();
        miPerro.ladrar();
    }
}
