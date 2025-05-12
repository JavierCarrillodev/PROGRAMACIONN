import java.io.BufferedWriter;
import java.io.FileWriter;

/* Ejercicio 1: Crear y escribir en un archivo
Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.*/
public class Ejer1 {
    public static void main(String[] args) {
        String fichero = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
        String texto = "Hola buenos tardes";
    }
    public static void CrearyEscribirFichero(String fichero, String texto) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
            System.out.println("Creado correctamente");
            bw.write(texto);
            bw.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
