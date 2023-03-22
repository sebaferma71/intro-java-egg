package guia3.extras;

import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int num1, num2, resultado, respuesta;

            num1 = (int)(Math.random() * 10);
            num2 = (int)(Math.random() * 10);

            resultado = num1 * num2;

            do {
                System.out.println("Ingrese un resultado de la multiplicacion aleatoria:");
                respuesta = leer.nextInt();

                if (respuesta != resultado) {
                    System.out.println("El resultado es incorrecto, intenta nuevamente");
                }
            } while (respuesta != resultado);
        }
    }
}