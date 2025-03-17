package EXAMEN;

public class Fracciones {

    private int num;
    private int den;

    public Fracciones(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fracciones() {
        this.num = 0;
        this.den = 1;
    }

    public Fracciones(int num) {
        this.num = num;
        this.den = 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public Fracciones sumar(Fracciones fracciones) {
        int numerador = this.num + fracciones.getDen();
        int denominador = this.den + fracciones.getNum();
        int totalNumerador = numerador + denominador;
        int totalDenominador = this.den + fracciones.getDen();
        return new Fracciones(totalDenominador,totalNumerador);

    }
    public Fracciones restar(Fracciones fracciones) {
        int numerador = this.num * fracciones.getDen();
        int denominador = this.den * fracciones.getNum();
        int totalNumerador = numerador - denominador;
        int totalDenominador = this.den * fracciones.getDen();
        return new Fracciones(totalNumerador,totalDenominador);

    }

    public Fracciones multiplicar(Fracciones fracciones) {
        int numerador = this.num * fracciones.getNum();
        int denominador = this.den * fracciones.getDen();
        return new Fracciones(numerador,denominador);
    }
    public Fracciones dividir(Fracciones fracciones) {
        int numerador = this.num * fracciones.getDen();
        int denominador = this.den * fracciones.num;
        return new Fracciones(numerador,denominador);
    }


    @Override
    public String toString() {
        return num + "/" + den;
    }
}