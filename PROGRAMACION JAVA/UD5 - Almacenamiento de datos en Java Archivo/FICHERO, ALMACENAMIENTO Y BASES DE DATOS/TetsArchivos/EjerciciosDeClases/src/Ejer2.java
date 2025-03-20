import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Ejercicio 2: Leer un archivo carácter por carácter**
Escribe un programa en Java que lea el archivo `datos.txt` carácter por carácter y muestre el contenido en la pantalla.*/
public class Ejer2 {
    public static void main(String[] args) {
        String Ficherito = "datos.txt";

        try (java.io.FileReader fileReader = new java.io.FileReader(Ficherito);
             BufferedReader br = new BufferedReader(fileReader)) {
            int character;
            while ((character = br.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
