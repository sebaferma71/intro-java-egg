package guia7.ejercicio2;

import java.util.Scanner;

public class Core {

    public static void main(String[] args) {
            crearCircunferencia();
    }

    public static void crearCircunferencia() {
        double radio;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Escribe el radio de la circunferencia:");
            radio = leer.nextDouble();

            Circunferencia c = new Circunferencia(radio);

            System.out.println("El area es: " + c.area());
            System.out.println("El perimetro es: " + c.perimetro());
        }
    }
}