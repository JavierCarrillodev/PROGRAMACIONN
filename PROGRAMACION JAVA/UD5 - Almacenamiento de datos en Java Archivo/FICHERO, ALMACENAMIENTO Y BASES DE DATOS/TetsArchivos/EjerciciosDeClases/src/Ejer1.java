import java.io.*;

/*Ejercicio 1: Crear y escribir en un archivo. Crea un programa en Java que cree un archivo de texto llamado
`datos.txt` y escriba dentro de él un mensaje de bienvenida*/

public class Ejer1 {
    public static void main(String[] args) {

        CrearFichero("hola");
    }
    public static void CrearFichero(String nombre) {

        File archivo = new File(nombre);

        try {
          if (!archivo.exists()) {
              archivo.createNewFile();
          }
          FileWriter fw = new FileWriter(archivo);
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Hola que tal");
          bw.close();

        }catch (IOException e){
            System.out.println("No se ha leido el fichero, ERROR " + e.getMessage());
        }
    }
}
