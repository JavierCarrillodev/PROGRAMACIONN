import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profesores profesores = new Profesores();
        profesores.cargarProfesores();
        int opcion;
        do{
            System.out.println("-----CRUD MENU-----");
            System.out.println("1. Crear Profesor");
            System.out.println("2. Leer Profesores");
            System.out.println("3. Actualizar Profesor");
            System.out.println("4. Eliminar Profesor");
            System.out.println("5. Buscar Profesor");
            System.out.println("6.Salir y guardar");
            System.out.println("Elige una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    profesores.crearProfesores();
                    break;
                case 2:
                    profesores.leerProfesore();
                    break;
                case 3:
                    profesores.actualizarProfesor();
                    break;
                case 4:
                    profesores.eliminarProfesor();
                    break;
                case 5:
                    profesores.buscarPorNombre();
                    break;
                case 6:
                    System.out.println("Saliendo y guardando...");
                    default:
            }

        }while (opcion != 6);
    }
}
