package guia2;

import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una temperatura en °C:");
            int c = leer.nextInt();

            int f = 32 + (9 * c / 5);

            System.out.println(c + " °C equivalen a " + f + "°F");
        }
    }
}
