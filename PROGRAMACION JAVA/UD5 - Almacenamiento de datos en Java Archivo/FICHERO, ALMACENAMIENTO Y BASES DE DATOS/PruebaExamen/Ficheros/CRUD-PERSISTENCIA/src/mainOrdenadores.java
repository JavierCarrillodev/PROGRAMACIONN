import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class mainOrdenadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ordenadores ordenadores = new Ordenadores();
        ordenadores.cargarOdenadores();
        ObjectMapper mapper = new ObjectMapper();
        int opcion;

        do{
            System.out.println("----- CRUD ORDENADORES -----");
            System.out.println("1. Crear ordenadores");
            System.out.println("2. Leer ordenadores");
            System.out.println("3. Buscar ordenador");
            System.out.println("4. Actualizar ordenador");
            System.out.println("5. Borrar ordenador");
            System.out.println("6. Salir y guardar");
            System.out.println("Indica una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    ordenadores.crearOrdenadores();
                    break;
                case 2:
                    ordenadores.leerOrdenadores();
                    break;
                case 3:
                    ordenadores.buscarOrdenadores();
                    break;
                case 4:
                    ordenadores.actualizarOrdenador();
                    break;
                case 5:
                    ordenadores.eliminarOrdenador();
                    break;
                case 6:
                    System.out.println("Saliendo y guardando");
                    ordenadores.guardarOrdenadores();
                    break;
            }

        }while (opcion != 6);
    }
}
