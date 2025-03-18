import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        String texto = "Esto es un ejemplo\n";
        String fichero = "fichero.txt";

        try {
            //Creamos un objeto FileWriter
            FileWriter fileWriter = new FileWriter(fichero, true);

            //Escribimos una String en el archivo
            fileWriter.write(texto);
            //Cerramos el FileWriter
            fileWriter.close();

            System.out.println("Se ha escrito el fichero correctamente");

        }catch (IOException e){
            System.out.println("No se ha escrito el fichero ERROR");
            e.printStackTrace();
        }
    }
}