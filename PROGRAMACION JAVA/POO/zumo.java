
public class zumo {
    String nombre = "Bifruta";
    int precio = 2;

    public zumo(String nombre, int precio) {
        nombre = nombre;
        precio = precio;
    }
    public static void main(String[] args) {
        zumo zumito = new zumo("Bifrutas", 2);
        System.out.println("Estoy tomando un zumo llamado " + zumito.nombre + " Que cuesta " + zumito.precio + "€");
    }



}
