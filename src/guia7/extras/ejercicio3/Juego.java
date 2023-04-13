package guia7.extras.ejercicio3;

import java.util.Scanner;

public class Juego {

    private String jugador1, jugador2, seguir;
    private int numero, intentos, contIntentos, prueba, ganaJ1, ganaJ2;
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

    public void setGanaJ1(int ganaJ1) {
        this.ganaJ1 = ganaJ1;
    }

    public void setGanaJ2(int ganaJ2) {
        this.ganaJ2 = ganaJ2;
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

    public boolean getGanar() {
        return ganar;
    }

    public int getPrueba() {
        return prueba;
    }

    public int getGanaJ1() {
        return ganaJ1;
    }

    public int getGanaJ2() {
        return ganaJ2;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        this.setJugador1("Sebastian");
        this.setJugador2("Matias");
        this.setIntentos(5);

        do {
            Core.clearScreen();

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

            if (this.ganar == true) {
                this.ganaJ2 += 1;
            }
            else {
                this.ganaJ1 += 1;
            }

            Core.clearScreen();

            if (this.getGanar() == true) {
                System.out.println("Ganaste!");
            }
            else {
                System.out.println("Perdiste!");
            }

            System.out.println("El jugador 1 gano: " + this.getGanaJ1());
            System.out.println("El jugador 2 gano: " + this.getGanaJ2());

            System.out.println();
            System.out.println("¿Queres jugar de nuevo? (S/N)");
            do {
                this.seguir = leer.nextLine().toUpperCase();
            } while (!this.seguir.equals("S") && !this.seguir.equals("N"));
        } while (this.seguir.equals("S"));
    }
}