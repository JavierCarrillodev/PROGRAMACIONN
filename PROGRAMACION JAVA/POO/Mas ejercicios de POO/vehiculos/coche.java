package vehiculos;

public class coche extends Vehiculo {
    private int NumeroDePuertas;

    public coche(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);
        NumeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "coche{" +
                "NumeroDePuertas=" + NumeroDePuertas +
                '}';
    }
}
