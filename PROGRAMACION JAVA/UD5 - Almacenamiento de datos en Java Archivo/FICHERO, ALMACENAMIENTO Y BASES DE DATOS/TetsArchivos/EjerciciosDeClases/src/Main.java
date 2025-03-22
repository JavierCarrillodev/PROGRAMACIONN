import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int opciones;
            do {
                System.out.println("----------------------------");
                System.out.println("    INTRODUCE UNA OPCION");
                System.out.println("----------------------------");

                System.out.println("1. Crear Fichero");
                System.out.println("2. Leer fichero por caracter");
                System.out.println("3. Leer fichero linea por linea");
                System.out.println("4. Agregar contenido archivo");
                System.out.println("5. Contar palabras de un archivo");
                System.out.println("6. Copiar archivo");
                System.out.println("7. Cantidad de palabras");
                System.out.println("8. Contar lineas");
                System.out.println("9. Renombrar archivo");
                System.out.println("10. Eliminar archivo");
                System.out.println("11. Mostrar Ruta");
                System.out.println("12. Salir del programa");
                opciones = sc.nextInt();
                sc.nextLine();

                switch (opciones) {
                    case 1:
                        System.out.println("Introduzca el nombre del fichero que deseas crear, y despues el contenido que quieres introducir el archivo");
                        Ejer1.CrearFichero(sc.next(), sc.next());
                        break;
                    case 2:
                        System.out.println("Introduce el fichero que deseas leer");
                        Ejer2.LeerPorCaracter(sc.next());
                        break;
                    case 3:
                        System.out.println("Introduce el fichero que deseas leer linea por linea\n");
                        Ejer3.LeerLineaPorLinea(sc.next());
                        break;
                    case 4:
                        System.out.println("Introduce el nombre del fichero y contenido");
                        Ejer4.AgregarContenidoArchivo(sc.next(), sc.next());
                        break;
                    case 5:
                        System.out.println("Introduce el archivo para contar las palabras");
                        Ejer5.ContarPalabraArchivos(sc.next());
                        break;
                    case 6:
                        System.out.println("Que archivo quieres copiar y en donde lo quieres copiar?");
                        Ejer6.copiarArchivo(sc.next(), sc.next());
                        break;
                    case 7:
                        System.out.println("Introduce el archivo donde quieras buscar cuantas veces se repite x palabra");
                        Ejer7.cantidadPalabras(sc.next(), sc.next());
                        break;
                    case 8:
                        System.out.println(" Indica el archivo en el que quieras contar la cantidad de líneas que tiene");
                        Ejer8.ContarLineas(sc.next());
                        break;
                    case 9:
                        System.out.println("Indica el nombre del archivo que quieres renombrar y su nombre nuevo");
                        Ejer9.RenombrarArchivos(sc.next(), sc.next());
                        break;
                    case 10:
                        System.out.println("Indica que archivo quieres eliminar");
                        Ejer10.EliminarArchivo(sc.next());
                        break;
                    case 11:
                        System.out.println("Indica la ruta que quieras mostrar");
                        Ejer11.MostrarRuta(sc.next());
                        break;
                    case 12:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }

            } while (opciones != 12);
    }
}
