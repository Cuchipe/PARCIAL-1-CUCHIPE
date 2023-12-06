/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploclaseobjetos;

/**
 *
 * @author usuario
 */
// Interfaz
interface Animal {
    void hacerSonido();
}

// Implementación de la interfaz
class Perro implements Animal {
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato implements Animal {
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        // Arreglo de objetos de diferentes clases que implementan la interfaz
        Animal[] animales = {new Perro(), new Gato()};

        // Llamada a métodos de la interfaz utilizando polimorfismo
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
