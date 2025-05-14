
import java.util.Scanner;

public class mainLibros {
    public static void main(String[] args) {
        Libros libro = new Libros();
        Scanner sc = new Scanner(System.in);
        libro.cargarLibros();
        int opcion;

        do{
            System.out.println("----- CRUD Libros -----");
            System.out.println("1. Crear Libros");
            System.out.println("2. Listar Libros");
            System.out.println("3. Buscar Libro");
            System.out.println("4. Actualizar Libro");
            System.out.println("5. Borrar Libro");
            System.out.println("6. Salir y guardar");
            System.out.println("Indica una opcion: ");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    libro.crearLibros();
                    break;
                case 2:
                    libro.listarLibros();
                    break;
                case 3:
                    libro.buscarLibros();
                    break;
                case 4:
                    libro.actualizarLibros();
                    break;
                case 5:
                    libro.eliminarLibros();
                    break;
                case 6:
                    System.out.println("Saliendo y guardando");
                    libro.guardarLibros();
                    break;
            }

        }while (opcion != 6);
    }
}
