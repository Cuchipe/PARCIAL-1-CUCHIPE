/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
// Clase con encapsulamiento
class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}

public class EjemploEncapsulamiento {
    public static void main(String[] args) {
        // Uso de la clase con encapsulamiento
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        cuenta.retirar(200);

        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}
