import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Ejer3 {
    public static void main(String[] args) {

        Path origen = Paths.get("Ejercicio1.txt");
        Path destino = Paths.get("copia.txt");

        try {
           Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado correctamente " );



        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
