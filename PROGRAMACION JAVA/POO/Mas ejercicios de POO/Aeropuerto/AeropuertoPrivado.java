package Aeropuerto;

public class AeropuertoPrivado extends Aeropuerto {
    private int numeroDeSocios;

    public AeropuertoPrivado() {
        this("",0,0,0);
    }

    public AeropuertoPrivado(String nombre, int anoDeInaguracion, int capacidad, int numeroDeSocios) {
        super(nombre, anoDeInaguracion, capacidad);
        this.numeroDeSocios = numeroDeSocios;
    }

    public int getNumeroDeSocios() {
        return numeroDeSocios;
    }

    public void setNumeroDeSocios(int numeroDeSocios) {
        this.numeroDeSocios = numeroDeSocios;
    }

    @Override
    public void gananciasTotales(int cantidad) {
        int ganaciaSocio = cantidad / numeroDeSocios;
        System.out.println("Cada socio ha ganado " + ganaciaSocio);
    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroDeSocios=" + numeroDeSocios +
                '}';
    }
}
