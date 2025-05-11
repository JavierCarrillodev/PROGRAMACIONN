import java.io.FileWriter;

public class fileWriter {
    public static void main(String[] args) {

        String texto = "Esto es un repaso\n";
        String fichero = "holahola.txt";

        try{
            FileWriter fileWriter = new FileWriter(fichero,true );
            fileWriter.write(texto);
            fileWriter.close();
            System.out.println("Se ha escrito el fichero correctamente");


        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
