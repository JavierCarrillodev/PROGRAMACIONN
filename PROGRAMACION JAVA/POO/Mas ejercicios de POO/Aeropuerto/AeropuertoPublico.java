package Aeropuerto;

public class AeropuertoPublico extends Aeropuerto {
    private int financiacion;
    private int numeroDeTrabajadoresDiscapacitados;

    public AeropuertoPublico() {
        this("",0,0,0,0);
    }

    public AeropuertoPublico(String nombre, int anoDeInaguracion, int capacidad, int financiacion, int numeroDeTrabajadoresDiscapacitados) {
        super(nombre, anoDeInaguracion, capacidad);
        this.financiacion = financiacion;
        this.numeroDeTrabajadoresDiscapacitados = numeroDeTrabajadoresDiscapacitados;
    }

    @Override
    public void gananciasTotales(int cantidad) {
        int ganancias = cantidad + financiacion + (numeroDeTrabajadoresDiscapacitados * 1000);
        System.out.println("Las ganacias han sido de " + ganancias);

    }

    @Override
    public String toString() {
        return super.toString() +
                "financiacion=" + financiacion +
                ", numeroDeTrabajadoresDiscapacitados=" + numeroDeTrabajadoresDiscapacitados +
                '}';
    }
}
