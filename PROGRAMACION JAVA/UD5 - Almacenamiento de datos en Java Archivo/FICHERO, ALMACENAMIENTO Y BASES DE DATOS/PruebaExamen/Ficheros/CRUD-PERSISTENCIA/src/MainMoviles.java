import java.util.Scanner;

public class MainMoviles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moviles moviles = new Moviles();
        moviles.cargarMoviles();
        int opcion;

        do{
            System.out.println("----- CRUD Moviles -----");
            System.out.println("1. Crear Moviles");
            System.out.println("2. Leer Moviles");
            System.out.println("3. Buscar Moviles");
            System.out.println("4. Actualizar Moviles");
            System.out.println("5. Borrar Moviles");
            System.out.println("6. Salir y guardar");
            System.out.println("Indica una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    moviles.crearMoviles();
                    break;
                case 2:
                    moviles.listarMoviles();
                    break;
                case 3:
                    moviles.buscarMoviles();
                    break;
                case 4:
                    moviles.actualizarMoviles();
                    break;
                case 5:
                    moviles.eliminarMovil();
                    break;
                case 6:
                    System.out.println("Saliendo y guardando...");
                    moviles.guardarMoviles();
                default:
            }

        }while (opcion != 6);
    }
}
