/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcuexscep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcuExscep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        System.out.println("    CALCULEITOR.COM");
        System.out.println("   ---BIENVENIDO---");
        System.out.println("--------------------------");

        int num1 = obtenerNumero("Dijite el primer valor: ", scanner);
        int num2 = obtenerNumero("Dijite el segundo valor: ", scanner);

        System.out.println("--------------------------");

        int opcion = obtenerOpcion(scanner);

        while (opcion < 1 || opcion > 4) {
            System.out.println("Opcion invalida. Por favor, seleccione una operacion valida (1-4).");
            opcion = obtenerOpcion(scanner);
        }

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println(" --Operacion aprobada--");
        }

        System.out.println("----------------------");
        System.out.println("El resultado de la operación es: " + resultado);
        System.out.println("     --Thank you --");
        scanner.close();
    }

    public static int obtenerNumero(String mensaje, Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero valido.");
                scanner.next(); 
            }
        }

        return numero;
    }

    public static int obtenerOpcion(Scanner scanner) {
        int opcion = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Escoja la operación a realizar:");
                System.out.println("1 ---> Suma");
                System.out.println("2 ---> Resta");
                System.out.println("3 ---> Multiplicación");
                System.out.println("4 ---> División");
                opcion = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero valido para la operacion.");
                scanner.next(); 
            }
        }

        return opcion;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
}
