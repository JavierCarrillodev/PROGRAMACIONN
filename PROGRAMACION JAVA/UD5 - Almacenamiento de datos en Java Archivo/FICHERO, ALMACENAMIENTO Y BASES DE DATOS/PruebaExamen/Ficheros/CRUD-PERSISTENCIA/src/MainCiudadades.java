import java.util.Scanner;

public class MainCiudadades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ciudadades ciudad = new Ciudadades();
        ciudad.cargarCiudad();
        int opcion;

        do{
            System.out.println("----- CRUD Libros -----");
            System.out.println("1. Crear Libros");
            System.out.println("2. Listar Libros");
            System.out.println("3. Buscar Libro");
            System.out.println("4. Actualizar Libro");
            System.out.println("5. Borrar Libro");
            System.out.println("6. Salir y guardar");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    ciudad.crearCiudad();
                    break;
                case 2:
                    ciudad.listarCiudades();
                    break;
                case 3:
                    ciudad.buscarCiudad();
                    break;
                case 4:
                    ciudad.actualiazarCiudades();
                    break;
                case 5:
                    ciudad.eliminarCiudad();
                    break;
                case 6:
                    System.out.println("Saliendo y guardando...");
                    ciudad.guardarCiudad();
                    break;

            }
        }while (opcion != 6);
    }
}
