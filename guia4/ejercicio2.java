package guia4;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        String seguir, nombre;
        int n, edad;

        try (Scanner leer = new Scanner(System.in)) {

            System.out.println("Ingrese la cantidad de personas a cargar:");
            n = leer.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Ingrese el nombre de la persona " + i + ":");
                nombre = leer.nextLine();

                System.out.println("Ingrese la edad de " + nombre + ":");
                edad = leer.nextInt();

                MostrarDatos(nombre, edad);

                if (i != n) {
                    System.out.println("Desea ingresar otra persona? (Si / No) ");
                    do {
                        seguir = leer.nextLine();
                    } while(seguir.equals("Si") && seguir.equals("No"));
                    

                    if (seguir.equals("No")) {
                        break;
                    }
                }
            }
        }
    }

    public static void MostrarDatos(String name, int age) {
        if (age < 18) {
            System.out.println(name + " es menor, tiene " + age + " años.");
        }
        else {
            System.out.println(name + " es mayor, tiene " + age + " años.");
        }
    }
}