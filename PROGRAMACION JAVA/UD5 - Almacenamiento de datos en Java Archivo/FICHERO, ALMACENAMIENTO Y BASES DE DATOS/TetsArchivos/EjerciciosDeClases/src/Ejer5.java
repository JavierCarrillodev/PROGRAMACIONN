import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Ejercicio 5: Contar palabras en un archivo**
Crea un programa que cuente el número total de palabras en el archivo `datos.txt` y muestre el resultado en la consola.*/
public class Ejer5 {
    public static void main(String[] args) {
        String Fichero = "datos.txt";
        int totalPalabra = 0;


        try {

            BufferedReader br = new BufferedReader( new FileReader(Fichero));

           String linea;
           while ((linea = br.readLine()) != null) {
               String[] palabras = linea.split(" ");
               totalPalabra += palabras.length;
           }

            br.close();

            System.out.println("Total de palabras: " + totalPalabra);
        }catch (IOException e){
            System.out.println("Error al contar palabra" + e.getMessage());
        }
    }
}
