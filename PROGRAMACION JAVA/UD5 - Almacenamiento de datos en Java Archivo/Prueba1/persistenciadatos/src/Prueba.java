import java.io.*;
public class Prueba {
    public static void crearArchivos(String nombreArchivo) {
        File archivo = new File("nombreArchivo");

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println(" Se creo con exito el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }

    }
    public static void main(String[] args) {
        crearArchivos("archivos \\Hola.txt");
    }
}
