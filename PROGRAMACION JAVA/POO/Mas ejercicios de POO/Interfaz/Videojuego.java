package Interfaz;

public class Videojuego implements Interfaz {
    private String nombre;
    private int precio;
    private boolean prestado;
    private int vecesPrestado;

    public Videojuego(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public void prestar() {
        if (prestado) {
            System.out.println("El videojuego ya esta prestado");
        }else {
            prestado = true;
            vecesPrestado++;
            System.out.println("El videojuego se ha prestado " + vecesPrestado + " veces");
        }
    }

    @Override
    public void devolver() {
        if (!prestado) {
            System.out.println("El videojuego no esta prestado");
        }else {
            prestado = false;
            System.out.println("El videojuego se ha devuelto");
        }

    }
}
