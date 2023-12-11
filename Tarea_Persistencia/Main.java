

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, nacionalidad;
        int edad;
        float estatura;
        int numeroPersonas;

        System.out.print("Ingrese la cantidad de personas a registrar: ");
        numeroPersonas = entrada.nextInt();

        // Creamos los objetos para las personas
        Persona registro[] = new Persona[numeroPersonas];

        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println("Bienvenido, ingrese los datos de la persona " + (i + 1) + ":");

            System.out.print("Ingrese su nombre: ");
            nombre = entrada.next();

            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();

            System.out.print("Ingrese su estatura: ");
            estatura = entrada.nextFloat();

            System.out.print("Ingrese su nacionalidad: ");
            nacionalidad = entrada.next();

            System.out.println("----------------------------------");

            registro[i] = new Persona(nombre, edad, estatura, nacionalidad);
            System.out.println(registro[i].mostrarDatos());
        }

        // Guardar los datos en un archivo de texto en el escritorio
        guardarDatosEnArchivo(registro, "C:\\Users\\usuario\\Documents\\Tarea_Persistencia\\datos_personas.txt");

        // Cargar los datos desde el archivo de texto en el escritorio
        Persona[] datosCargados = cargarDatosDesdeArchivo("C:\\Users\\usuario\\Documents\\Tarea_Persistencia\\datos_personas.txt");

        // Imprimir los datos cargados
        for (Persona persona : datosCargados) {
            System.out.println(persona.mostrarDatos());
        }
    }

    // Método para guardar datos en un archivo de texto
    private static void guardarDatosEnArchivo(Persona[] personas, String rutaArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (Persona persona : personas) {
                writer.println(persona.mostrarDatos());
            }
            System.out.println("Datos guardados correctamente en el archivo: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar datos desde un archivo de texto
    private static Persona[] cargarDatosDesdeArchivo(String rutaArchivo) {
        List<Persona> personas = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(rutaArchivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personas.toArray(new Persona[0]);
    }
}
