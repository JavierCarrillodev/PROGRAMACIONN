import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileReader {
    public static void main(String[] args) {

        String fichero = "fichero.txt";

        try {
            //Creamos un objeto FileWriter
            FileReader fileReader = new FileReader(fichero);

            //Leer y mostrar el contenido del archivo
            int caracter;
            System.out.println("Contenido de el fichero " + fichero + ":");
           while ((caracter = fileReader.read()) != -1) {
               System.out.print((char) caracter);
           }
            //Cerramos el FileWriter
            fileReader.close();

        }catch (IOException e){
            System.out.println("No se ha leido el fichero, ERROR");
        }
    }
}