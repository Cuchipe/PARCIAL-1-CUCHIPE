/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
// Clase abstracta
abstract class Figura {
    abstract double calcularArea();
}

// Clases derivadas
class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Cuadrado extends Figura {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}

public class EjemploClaseAbstracta {
    public static void main(String[] args) {
        // Arreglo de objetos de clases derivadas de la clase abstracta
        Figura[] figuras = {new Circulo(5), new Cuadrado(4)};

        // Llamada al método abstracto utilizando polimorfismo
        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
}
