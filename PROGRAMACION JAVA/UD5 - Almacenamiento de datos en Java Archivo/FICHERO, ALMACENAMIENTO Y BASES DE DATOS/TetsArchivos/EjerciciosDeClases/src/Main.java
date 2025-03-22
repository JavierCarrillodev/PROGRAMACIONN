import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opciones;
        do{
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
            opciones = sc.nextInt();

            switch (opciones){
                case 1:
                    System.out.println("Introduzca el nombre del fichero que deseas crear");
                    String nombreFichero = sc.nextLine();
                    Ejer1.CrearFichero(sc.next());
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
                    Ejer4.AgregarContenidoArchivo(sc.next(),sc.next());
                    break;
                case 5:
                    System.out.println("Introduce el archivo para contar las palabras");
                    Ejer5.ContarPalabraArchivos(sc.next());
                    break;
                case 6:
                    System.out.println("Que archivo quieres copiar y en donde lo quieres copiar?");
                    Ejer6.copiarArchivo(sc.next(),sc.next());
                    break;
                case 7:
                    System.out.println("Introduce el archivo donde quieras buscar cuantas veces se repite x palabra");
                    Ejer7.cantidadPalabras(sc.next(), sc.next());
                    break;
                case 8:
                    Ejer8.ContarLineas("copia.txt", "hola");
                    break;
                case 9:
                    Ejer9.RenombrarArchivos("ejemplo.txt","ejemplillo.txt");
                    break;
                case 10:
                    Ejer10.EliminarArchivo("hola.txt");
                    break;
                case 11:
                    Ejer11.MostrarRuta(".");
                    break;
                case 12:
                    System.out.println("Saliendo...");
                    break;
                    default:
                        System.out.println("Opcion no valida");
            }

        }while (opciones !=12);

    }
}
