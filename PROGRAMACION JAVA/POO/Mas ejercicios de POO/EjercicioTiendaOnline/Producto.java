package EjercicioTiendaOnline;

public class Producto {
    private String nombre;
    private double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reducirStock() {
        if (stock > 0) {
            stock --;
        }else System.out.println("No hay suficiente stock");
    }

    @Override
    public String toString() {
        return "nombre = " + nombre;
    }
}
