import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Ejercicio 1: Crear y escribir en un archivo. Crea un programa en Java que cree un archivo de texto llamado
`datos.txt` y escriba dentro de él un mensaje de bienvenida*/

public class Ejer1 {
    public static void main(String[] args) {
        String Fichero = "datos.txt";

        File Datos = new File("/home/javi/Escritorio/datos.txt");
        try {
            FileWriter fw = new FileWriter(Fichero);
            fw.write("Hola esto es la bienvenida");
            fw.close();

        }catch (IOException e){
            System.out.println("No se ha leido el fichero, ERROR " + e.getMessage());
        }
    }
}
