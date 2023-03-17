package guia2;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        try (Scanner ingresar = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre:");
            String nombre = ingresar.nextLine();

            System.out.println("Hola, " + nombre);
        }
    }
}
