package EjercicioTiendaOnline;

import java.util.ArrayList;

public class Carrito {
   protected ArrayList<Producto> productos;
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);

        producto.reducirStock();
    }

        public void mostrarResumen(){
            System.out.println("El carrito contiene " + productos.toString() + " productos");
        }
        public void vaciarCarrito(){
        productos.clear();
        }

    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}
