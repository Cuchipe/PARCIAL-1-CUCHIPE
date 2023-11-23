/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraa;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Calculadoraa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        System.out.println("    CALCULEITOR.COM");
        System.out.println("   ---BIENVENIDO---");
        System.out.println("--------------------------");


        System.out.print("Dijite el primer valor: ");
        int num1 = scanner.nextInt();

        System.out.print("Dijite el segundo valor: ");
        int num2 = scanner.nextInt();
        System.out.println("--------------------------");

        System.out.println("Escoja la operacion a realizar:");
        System.out.println("1 ---> Suma");
        System.out.println("2 ---> Resta");
        System.out.println("3 ---> Multiplicación");
        System.out.println("4 ---> División");
        int opcion = scanner.nextInt();

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
        System.out.println("El resultado de la operacion es: " + resultado);
        System.out.println("     --Thank you --");
        scanner.close();
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
