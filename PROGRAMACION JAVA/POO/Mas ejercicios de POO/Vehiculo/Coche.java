package Vehiculo;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numeroDePuertas=" + numeroDePuertas +
                '}';
    }
}
