package guia7.ejercicio3;

public class Operacion {
    
    private int num1, num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return this.num1;
    }

    public int getNumero2() {
        return this.num2;
    }

    public void setNumero1(int num1) {
        this.num1 = num1;
    }

    public void setNumero2(int num2) {
        this.num2 = num2;
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        return (double)(num1/num2);
    }
}
