package guia2;

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        try(Scanner ingresar = new Scanner(System.in)) {
            System.out.println("Ingrese una frase:");
            String frase = ingresar.nextLine();

            System.out.println("Frase en mayusculas:");
            System.out.println(frase.toUpperCase());
            System.out.println("Frase en minusculas:");
            System.out.println(frase.toLowerCase());
        }
    }
}