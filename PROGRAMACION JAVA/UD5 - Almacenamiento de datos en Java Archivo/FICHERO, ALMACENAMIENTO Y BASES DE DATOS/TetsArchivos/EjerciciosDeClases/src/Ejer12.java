import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* Ejercicio 12: Leer un archivo CSV y mostrar los datos
 Crea un programa que lea un archivo CSV llamado `datos.csv` y muestre su contenido en formato tabla.*/
public class Ejer12 {
    public static void main(String[] args) {
        // Ruta del archivo CSV
        String archivoCSV = "";

        // Llamar al metodo para leer y mostrar los datos
        leerYMostrarCSV(archivoCSV);
    }

    public static void leerYMostrarCSV(String archivo) {
        // Usamos BufferedReader para leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            // Mostrar encabezados (si los hay) o solo las líneas de datos
            while ((linea = br.readLine()) != null) {
                // Separar cada línea por comas
                String[] datos = linea.split(",");

                // Mostramos los datos en formato tabla
                for (String dato : datos) {
                    System.out.printf(dato);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
