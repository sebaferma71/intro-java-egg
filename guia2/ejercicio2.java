package guia2;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre:");
            String nombre = leer.nextLine();

            System.out.println("Hola, " + nombre);
        }
    }
}
