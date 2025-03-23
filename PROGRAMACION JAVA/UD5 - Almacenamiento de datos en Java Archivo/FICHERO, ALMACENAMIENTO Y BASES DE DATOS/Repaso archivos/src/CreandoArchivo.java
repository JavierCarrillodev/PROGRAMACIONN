import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreandoArchivo {
    public static void main(String[] args) {

        String archivo = "datillos.txt";

        archivoLeer("datillos.txt");
    }
    public static void archivoLeer(String archivo) {

        try {
            FileReader fr = new FileReader(archivo);
            int caracter;
            System.out.println("Contenido del archivo: " + archivo + ":");
            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }
            fr.close();


        } catch (Exception e) {
            System.out.println("Error");

        }


    }
}
