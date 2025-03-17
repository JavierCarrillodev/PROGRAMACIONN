package Producto;

public class ProductoRefrigerado extends Producto {

    private int cajon;

    public ProductoRefrigerado(int cajon) {
        this("",0,0);
    }

    public ProductoRefrigerado(String nombre, int precio, int cajon) {
        super(nombre, precio);
        this.cajon = cajon;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    @Override
    public int comprar(int cantidad) {
        return super.comprar(cantidad);
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "id=" + getId() +
                ", cajon=" + cajon +
                '}';
    }
}
