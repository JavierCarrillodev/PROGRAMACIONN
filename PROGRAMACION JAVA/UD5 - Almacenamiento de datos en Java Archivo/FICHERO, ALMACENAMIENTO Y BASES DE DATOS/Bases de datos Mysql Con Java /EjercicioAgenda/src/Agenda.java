
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int opcion;
        File archivoJSON = new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/Bases de datos Mysql Con Java /EjercicioAgenda/src/Contactos.json");
        List<Contacto> contactos = Contacto.recuperarContactos(archivoJSON);


        do {
            System.out.println("GESTOR DE CONTACTOS");
            System.out.println
                    ("1. Agregar contacto " +
                    "\n2. Eliminar contacto" +
                    "\n3. Buscar contacto" +
                    "\n4. Listar todos los contactos" +
                    "\n5. Recuperar contacto" +
                    "\n6. Guardar y salir.");
            System.out.println("Elige una opción:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    Contacto.agregarContacto(contactos);

                    break;

                case 2:
                    Contacto.eliminarContacto(contactos,archivoJSON);

                    break;

                case 3:
                    Contacto.buscarContacto(contactos);

                    break;

                case 4:
                    Contacto.listarTodosContactos(contactos);

                    break;
                case 5:
                    contactos = Contacto.recuperarContactos(archivoJSON);
                    System.out.println("Contactos recuperados con exito");
                    break;

                case 6:
                    Contacto.guardarJSON(contactos, archivoJSON);

                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 6);

    }
    
}