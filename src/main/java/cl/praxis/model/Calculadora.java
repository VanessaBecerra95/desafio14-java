package cl.praxis.model;

public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora() {
    }

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
