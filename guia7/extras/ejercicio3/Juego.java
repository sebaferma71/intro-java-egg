package guia7.extras.ejercicio3;

import java.util.Scanner;

public class Juego {

    private String jugador1, jugador2;
    private int numero, intentos, contIntentos, prueba;
    private boolean ganar;

    Juego() {
    }

    Juego(String jugador1, String jugador2, int numero, int intentos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numero = numero;
        this.intentos = intentos;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrueba(int prueba) {
        this.prueba = prueba;
    }

    public void setGanar(boolean ganar) {
        this.ganar = ganar;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getNumero() {
        return numero;
    }

    public int getPrueba() {
        return prueba;
    }

    public void iniciar_juego() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println(this.jugador1 + " elige un numero para que " + this.jugador2 + " adivine:");
            this.numero = leer.nextInt();

            Core.clearScreen();
            this.contIntentos = 0;
            this.ganar = false;

            do {
                this.contIntentos++;
                System.out.print("Prueba suerte: ");
                this.prueba = leer.nextInt();
                if (this.prueba < this.numero) {
                    System.out.println("El numero es mas alto");
                }
                else if (this.prueba > this.numero) {
                    System.out.println("El numero es mas bajo");
                }
                else {
                    this.ganar = true;
                }
            } while (this.ganar == false && this.contIntentos < this.intentos);
            
            Core.clearScreen();
            if (this.ganar == true) {
                System.out.println("Ganaste!");
            }
            else {
                System.out.println("Perdiste!");
            }
        }
    }
}