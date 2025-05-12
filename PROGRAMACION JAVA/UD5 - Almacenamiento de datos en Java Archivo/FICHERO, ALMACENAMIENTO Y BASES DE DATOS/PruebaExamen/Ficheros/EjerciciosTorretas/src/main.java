import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce crea el fichero con el nombre que quieras");
        String fichero = sc.nextLine();
        System.out.println("Introduce lo que quieras poner dentro del fichero ");
        String texto = sc.nextLine();
        Ejer1.CrearyEscribirFichero(fichero, texto);

        System.out.println("Introduce la ruta para contar por caracteres");
        String ruta = sc.nextLine();
        Ejer2CaracterPorCarcter.LeeryContarPorCaracter(ruta);

        System.out.println("Introduce la ruta para leer linea por linea");
        ruta = sc.nextLine();
        ejer3.LeerLineaPorLinea(ruta);

        System.out.println("Introduce la ruta del archivo que quieras agregarle mas texto");
        ruta = sc.nextLine();
        Ejer4.AgregarContenido(ruta);

        System.out.println("Introduce la ruta del archivo que quieras contar palabras");
        ruta = sc.nextLine();
        Ejer5.ContarPalabras(ruta);

        System.out.println("Introduce la ruta del archivo origen:");
        String rutaOrigen = sc.nextLine();

        System.out.println("Introduce la ruta del archivo destino:");
        String rutaDestino = sc.nextLine();
        File archivoDestino = new File(rutaDestino);
        Ejer6.CopiarContenidoDeUnArchivoAOtro(archivoDestino,rutaOrigen,rutaDestino);

        System.out.println("Introduce la ruta del archivo destino para contar las Palabras");
        String archivo = sc.nextLine();
        System.out.println("Introduce la palabra para buscar en el archivo");
        String palabraBuscada = sc.nextLine();
        Ejer7.BuscarPalabraYContar(archivo,palabraBuscada);

        System.out.println("Introduce el archivo para contar las lineas y decir cuantas hay");
        fichero = sc.nextLine();
        Ejer8.ContarCanidadDeLinea(fichero);

        System.out.println("Introduce el nombre del archivo antiguo para cambiarle el nombre");
        String rutaAntigua = sc.nextLine();
        System.out.println("Introduce el nuevo nombre del archivo");
        String rutaNueva = sc.nextLine();
        File nombreAntiguo = new File(rutaAntigua);
        File nombreNuevo = new File(rutaNueva);
        Ejer9.RenombrarArchivo(nombreAntiguo,nombreNuevo);

        System.out.println("Introduce el archivo que deseas borrar");
        String archivoBorrar = sc.nextLine();
        File archivoBorrarado = new File(archivoBorrar);
        Ejer10.BorrarArchivo(archivoBorrarado);

        System.out.println("Introduce la carpeta para listar");
        String carpetaListar = sc.nextLine();
        File carpeta = new File(carpetaListar);
        Ejer11.ListarArchivos(carpeta);

        System.out.println("Introduce el archivo para leer un archivo csv");
        archivo = sc.nextLine();
        Ejer12_LeerCSV.LeerCSV(archivo);

        System.out.println("Introduce la ruta origen de la imagen para copiarla");
        String origenruta = sc.nextLine();
        System.out.println("Introduce la ruta destino de la imagen para copiarla");
        String destinoruta = sc.nextLine();

        Path origen = Paths.get(origenruta);
        Path destino = Paths.get(destinoruta);
        Ejer13.CopiarImagen(origen,destino);

    }
}
