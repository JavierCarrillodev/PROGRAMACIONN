package POO.teclado;

public class teclado {
    String nombre;
    String color;
    int precio;

    public teclado(String nombre, String color, int precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
    public void teclear(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
}
