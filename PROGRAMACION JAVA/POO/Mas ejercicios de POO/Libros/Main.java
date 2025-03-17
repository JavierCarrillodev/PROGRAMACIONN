package Libros;

public class Main {
    public static void main(String[] args) {

       Libro libro = new Libro("12345 ","El hombre y la mierda",500,"Hector",false);
        Libro libro1 = new Libro("12345 ","El hombre y la mierda",500,"Hector",false);
       libro.prestar();
       libro.devolver();
       libro.devolver();
       libro.prestar();
       libro.prestar();
       System.out.println(libro.imprimir(0.1) + "€");

       if (libro.equals(libro1)) {
           System.out.println("Iguales");
       }else {
           System.out.println("Diferentes");
       }


    }
}
