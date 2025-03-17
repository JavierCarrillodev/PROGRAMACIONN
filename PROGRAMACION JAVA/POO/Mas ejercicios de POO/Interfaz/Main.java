package Interfaz;

public class Main {
    public static void main(String[] args) {

        Videojuego videojuego = new Videojuego("GTA6",100);
        videojuego.prestar();
        videojuego.devolver();
        videojuego.prestar();
        videojuego.devolver();
        videojuego.prestar();
        videojuego.devolver();

        Prestamo p = new Prestamo(500,"Javi");
        p.prestar();
        p.prestar();
        p.prestar();

        p.devolver();
        p.prestar();
        p.devolver();
        p.prestar();
        p.devolver();
        p.devolver();
        p.devolver();
        p.devolver();
    }
}
