package EjercicioTiendaOnline;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Movil",200,5);
        Producto producto2 = new Producto("Ordenador",600,2);

        Carrito carrito1 = new Carrito();
        Carrito carrito2 = new Carrito();
        Carrito carrito3 = new Carrito();

        Usuario usuario1 = new Usuario("Victoria","Pinares");
        Usuario usuario2 = new Usuario("javi","pena");
        Usuario usuario3 = new Usuario("alex","gol");

        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto2);
        carrito2.agregarProducto(producto1);
        carrito2.agregarProducto(producto2);
        carrito3.agregarProducto(producto1);
        carrito3.agregarProducto(producto2);

        carrito1.mostrarResumen();
        carrito2.mostrarResumen();
        carrito3.mostrarResumen();

        carrito1.vaciarCarrito();
        carrito2.vaciarCarrito();

        carrito1.mostrarResumen();
        carrito2.mostrarResumen();
        carrito3.mostrarResumen();

        System.out.println();

        usuario1.agregarProducto(carrito1);
        usuario1.realizarPedido();

        carrito1.mostrarResumen();

    }
}
