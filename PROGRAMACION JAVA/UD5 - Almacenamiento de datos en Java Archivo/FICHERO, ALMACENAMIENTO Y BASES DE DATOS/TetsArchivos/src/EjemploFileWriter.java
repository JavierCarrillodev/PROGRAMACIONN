import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        String texto = "Esto es un ejemplo\n";
        String texto2 = "Esto es otra prueba pero con otro fichero\n";
        String fichero = "fichero.txt";
        String fichero2 = "fichero2.txt";
        try {
            //Creamos un objeto FileWriter
            FileWriter fileWriter = new FileWriter(fichero, true);
            FileWriter fileWriter2 = new FileWriter(fichero2, true);

            //Escribimos una String en el archivo
            fileWriter.write(texto);
            fileWriter2.write(texto2);
            //Cerramos el FileWriter
            fileWriter.close();
            fileWriter2.close();

            System.out.println("Se ha escrito el fichero correctamente");

        }catch (IOException e){
            System.out.println("No se ha escrito el fichero ERROR");
            e.printStackTrace();
        }
    }
}