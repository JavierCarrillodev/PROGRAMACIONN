package Interfaz;

public class Prestamo implements Interfaz {

    private double cantidad;
    private double adeudo;
    private String titular;


    public Prestamo(double cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
        this.adeudo = 0;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void prestar() {
        adeudo += cantidad + (cantidad * 0.5);
        System.out.println("Se ha prestado " + cantidad + "€ al titular " + titular + "Adeudo total: " + adeudo + "€");
    }

    @Override
    public void devolver() {
    if (adeudo < cantidad) {
        adeudo = 0;
    }else {
        adeudo -= cantidad;
    }
        System.out.println("Se ha devuelto " + cantidad + "€ del titular " + titular + " adeudo total " + adeudo + "€");
    }
}
