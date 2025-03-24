import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBufferReader {
    public static void main(String[] args) {
        String nombreFichero = "ficheroN.txt";
        contarPalabras(nombreFichero);

    }
    public static void contarPalabras(String nombreFichero) {

        try {
            int palabras = 0;
            Scanner sc = new Scanner(new BufferedReader(new FileReader(nombreFichero)));

            while (sc.hasNextLine()) {
                palabras += Arrays.stream(sc.nextLine().split("\\s+")).count();
            }
            // Al cerrar el Scanner se cierra también el BufferReaders
            sc.close();
            System.out.println("El archivo " + nombreFichero + " tiene: " + palabras + " palabras");

        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}
