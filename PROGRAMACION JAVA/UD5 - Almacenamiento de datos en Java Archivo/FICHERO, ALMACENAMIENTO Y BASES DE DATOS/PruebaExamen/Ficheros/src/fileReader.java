import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {

        String fichero = "holahola.txt";

        try{
            FileReader fileReader = new FileReader(fichero);

            int caracter;
            System.out.println("Contenido del fichero " + fichero + ":");
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al leer el archivo");


        }

    }
}
