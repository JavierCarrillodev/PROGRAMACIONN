package biblioteca;

public class MainPublicacion {
    public static void main(String[] args) {

        Libro libro = new Libro("12ab", "Mulan", true, 2025);
        System.out.println(libro);

        Revista revista = new Revista("13vv", "pepe", 2021, 1234);
        System.out.println(revista);

        libro.prestarLibro();

        libro.devuelveLibro();

        libro.estaPrestado();
    }
}
