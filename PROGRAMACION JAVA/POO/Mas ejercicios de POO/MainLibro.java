import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro(" 4gsdfgdf ", "Las aventuras de nevado", 123, "Javi", true);
        Libro libro2 = new Libro(" 4gsdfgdf ", "Las aventuras del nevado", 123, "Javi", true);

    libro1.compararLibros(libro2);

       int opcion;

       do {


           System.out.println("Ingrese una opcion: ");
           System.out.println();

           System.out.println("1. Imprimir info del libro");
           System.out.println("2. Prestar el libro");
           System.out.println("3. Devolver el libro");
           System.out.println("4. Cuanto ha costado hacer el libro");
           System.out.println("5. Comparar libro");
           System.out.println("6. Salir");
           opcion = sc.nextInt();

           switch (opcion){
               case 1:
                   libro1.imprimirInfo();
                   break;
               case 2:
                   libro1.prestar();
                   break;
               case 3:
                   libro1.devolver();
                   break;
               case 4:
                   System.out.println("El libro ha costado " + libro1.imprimir(100) + "€");
               case 5:
                   libro1.compararLibros(libro2);
                   if (libro1.getISBN().equals(libro2.getISBN())) {
                       System.out.println("Los libros son iguales");
                   }else {
                       System.out.println("Los libros son diferentes");
                   }
                   break;
               case 6:
                   System.out.println("Saliendo del programa");
                   break;
               default:
                   System.out.println("Opcion no valida introduce de 1 - 6");

           }

       }while (opcion!=6);


    }
}
