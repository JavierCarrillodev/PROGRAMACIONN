package EjercicioTiendaOnline;

public class Usuario {

    private String nombre;
    private String direccion;
    private Carrito carrito;

    public Usuario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public void agregarProducto(Carrito carrito) {
        this.carrito = carrito;

    }

    public void realizarPedido() {
        System.out.println(carrito);
        carrito.vaciarCarrito();
        System.out.println("Pedido realizado con exito, ahora el carrito esta vacio");

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", carrito=" + carrito +
                '}';
    }
}
