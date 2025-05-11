import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreandoArchivo {
    public static void main(String[] args) {

        archivoLeer("ejemplillo.txt");
    }
    public static void archivoLeer(String archivo) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            int caracter;
            System.out.println("Contenido del archivo: " + archivo + ":");
            while ((caracter = br.read()) != -1) {
                System.out.print((char) caracter);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Error");

        }


    }
}
