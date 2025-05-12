import java.io.BufferedReader;
import java.io.FileReader;

/* Ejercicio 2: Leer un archivo carácter por carácter
Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.
*/
public class Ejer2CaracterPorCarcter {
    public static void main(String[] args) {
        String ruta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
    }
    public static void LeeryContarPorCaracter(String ruta) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            int caracter;
            while ((caracter = br.read()) != -1) {
                System.out.println((char) caracter);
            }

        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
