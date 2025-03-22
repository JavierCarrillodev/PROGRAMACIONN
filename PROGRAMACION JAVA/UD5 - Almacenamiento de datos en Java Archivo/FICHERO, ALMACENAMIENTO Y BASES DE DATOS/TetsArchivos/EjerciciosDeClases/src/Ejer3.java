import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Ejercicio 3: Leer un archivo línea por línea**
Desarrolla un programa en Java que lea el archivo `datos.txt` línea por línea e imprima cada línea en la consola.*/

public class Ejer3 {
    public static void main(String[] args) throws IOException {
        String Fichero = "datos.txt";
        LeerLineaPorLinea(Fichero);
    }
    public static void LeerLineaPorLinea(String Fichero){
        try {
            FileReader fw = new FileReader(Fichero);
            BufferedReader br = new BufferedReader(fw);

            int caracter;
            while((caracter = br.read()) != -1) {
                System.out.print((char) caracter);
            }
            br.close();

        }catch (IOException e){
            System.out.println("No se ha leido el fichero, ERROR " + e.getMessage());
        }
    }
}
