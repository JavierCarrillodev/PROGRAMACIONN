import java.io.*;

/*Ejercicio 1: Crear y escribir en un archivo. Crea un programa en Java que cree un archivo de texto llamado
`datos.txt` y escriba dentro de él un mensaje de bienvenida*/

public class Ejer1 {
    public static void main(String[] args) {
        String nombre = "";
        String contenido = "";
        CrearFichero(nombre,contenido);
    }
    public static void CrearFichero(String nombre,String contenido) {

        File archivo = new File(nombre);

        try {
          if (!archivo.exists()) {
              archivo.createNewFile();
          }
          FileWriter fw = new FileWriter(archivo);
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write(contenido);
          bw.close();
            System.out.println("El fichero se ha creado con exito");

        }catch (IOException e){
            System.out.println("No se ha leido el fichero, ERROR " + e.getMessage());
        }
    }
}
