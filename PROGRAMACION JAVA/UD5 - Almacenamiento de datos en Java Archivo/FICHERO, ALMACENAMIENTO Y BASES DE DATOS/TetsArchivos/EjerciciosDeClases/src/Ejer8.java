import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Ejercicio 8: Contar la cantidad de líneas en un archivo**
 Crea un programa que cuente cuántas líneas tiene el archivo `datos.txt` y muestre el total.*/
public class Ejer8 {
    public static void main(String[] args) {

        ContarLineas("datos.txt");
    }
    public static void ContarLineas(String fichero) {
        int contador = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero) );
            String linea;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            br.close();
            System.out.println("El fichero " + fichero + " tiene " + contador + " lineas");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero " + e.getMessage());
        }
    }
}


