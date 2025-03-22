
/* Ejercicio 6: Copiar el contenido de un archivo a otro**
Crea un programa que copie el contenido de `datos.txt` en un nuevo archivo llamado `copia.txt`, manteniendo el mismo formato.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer6 {
    public static void main(String[] args) {
        String archivoOrigen = "datos.txt"; // Archivo de origen
        String archivoDestino = "hola.txt"; // Archivo de destino

        // Llamar al metodo para copiar el contenido
        copiarArchivo(archivoOrigen, archivoDestino);
    }

    public static void copiarArchivo(String archivoOrigen, String archivoDestino) {
        try {
            // Crear FileReader y BufferedReader para leer el archivo origen
            FileReader fr = new FileReader(archivoOrigen);
            BufferedReader br = new BufferedReader(fr);

            // Crear FileWriter y BufferedWriter para escribir en el archivo destino
            FileWriter fw = new FileWriter(archivoDestino);
            BufferedWriter bw = new BufferedWriter(fw);

            // Leer y escribir línea por línea
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea); // Escribir la línea en el archivo de destino
                bw.newLine();     // Añadir un salto de línea
            }

            // Cerrar los flujos de lectura y escritura
            br.close();
            bw.close();

            System.out.println("El archivo se ha copiado exitosamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
