import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        Scanner sc = new Scanner(System.in);
       int opcion;
       do{
           System.out.println("---- MENU CRUD ----");
           System.out.println("1. Crear equipo");
           System.out.println("2. Listar equipos");
           System.out.println("3. Actualizar equipo");
           System.out.println("4. Eliminar equipo");
           System.out.println("5. Salir");
           System.out.print("Seleccione una opción: ");
           opcion = sc.nextInt();

           switch (opcion){
               case 1:
                   equipo.CrearEquipo();
                   break;
               case 2:
                   equipo.leerEquipos();
                   break;
               case 3:
                   equipo.actualizarEquipo();
                   break;
               case 4:
                   equipo.eliminarEquipo();
                   break;
               case 5:
                   System.out.println("Saliendo...");
               default:
           }
       }while (opcion != 5);


    }
}
