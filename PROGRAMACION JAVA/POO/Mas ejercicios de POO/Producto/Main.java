package Producto;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Producto 1",10);
        ProductoFresco p2 = new ProductoFresco("Producto 2",20,4);
        ProductoRefrigerado p3 = new ProductoRefrigerado("Producto 3",30,1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Compro 10 unidades del producto 1: " + p1.comprar(9));
        System.out.println("Compro 10 unidades del producto 1: " + p2.comprar(10));
        System.out.println("Compro 10 unidades del producto 1: " + p3.comprar(10));


    }
}
