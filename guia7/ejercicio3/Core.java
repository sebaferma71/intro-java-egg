package guia7.ejercicio3;

import java.util.Scanner;

public class Core {
    
    public static void main(String[] args) {
        crearOperacion();
    }

    public static void crearOperacion() {
        int n1, n2;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el primer numero para operar:");
            n1 = leer.nextInt();

            System.out.println("Ingrese el primer numero para operar:");
            n2 = leer.nextInt();

            Operacion operacion1 = new Operacion(n1, n2);

            System.out.println("La suma es: " + operacion1.sumar());
            System.out.println("La resta es: " + operacion1.restar());
            System.out.println("La multiplicacion es: " + operacion1.multiplicar());
            System.out.println("La division es: " + operacion1.dividir());
        }
    }
}