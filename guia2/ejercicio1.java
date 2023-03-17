package guia2;

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese un primer numero entero:");
            int num1 = leer.nextInt();

            System.out.println("Ingrese un segundo numero entero:");
            int num2 = leer.nextInt();

            int suma = num1 + num2;

            System.out.println("La suma es: " + suma);
        }
    }
}