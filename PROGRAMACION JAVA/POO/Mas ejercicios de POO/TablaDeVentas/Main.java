package TablaDeVentas;

public class Main {
    public static void main(String[] args) {

        TablaVentas tablaVentas = new TablaVentas();
        tablaVentas.introducirVentas();
        tablaVentas.mostrarVentas();
        System.out.println();

        tablaVentas.totalVentasProductos();

        tablaVentas.productoMasVendido();
    }
}
