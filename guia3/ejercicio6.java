package guia3;

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        int num1, num2, opcion, resultado;
        char rta;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero positivo:");
            num1 = leer.nextInt();

            System.out.println("Ingrese otro numero entero positivo:");
            num2 = leer.nextInt();

            opcion = 0;

            while (opcion != 5) {
                System.out.println("----------------");
                System.out.println("1 - Sumar");
                System.out.println("2 - Restar");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Salir");
                System.out.println("----------------");
                System.out.print("Elija opcion: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("La resta es: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("La multiplicacion es: " + resultado);
                        break;
                    case 4:
                        resultado = num1 / num2;
                        System.out.println("La division es: " + resultado);
                        break;
                    case 5:
                        System.out.println("¿Seguro desea salir? S/N");
                        do {
                            rta = leer.next().toUpperCase().charAt(0);
                        } while (rta == 'S' && rta == 'N');

                        if (rta == 'S') {
                            System.out.println("Saliendo...");
                        }
                        else {
                            opcion = 0;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}