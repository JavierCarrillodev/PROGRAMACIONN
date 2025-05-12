import java.util.Scanner;

public class maincoches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coches coches = new Coches();
        int opcion;

        do{
            System.out.println("-----MENU CRUD-----");
            System.out.println("1. Crear Coches");
            System.out.println("2. Leer Coches");
            System.out.println("3. Actualizar Coches");
            System.out.println("4. Eliminar Coches");
            System.out.println("5. Salir del programa");

            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    coches.crearCoche();
                    break;
                case 2:
                    coches.leerCoches();
                    break;
                case 3:
                    coches.actualizaCoches();
                    break;
                case 4:
                    coches.eliminarCoche();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                default:
            }
        }while (opcion != 5);


    }
}
