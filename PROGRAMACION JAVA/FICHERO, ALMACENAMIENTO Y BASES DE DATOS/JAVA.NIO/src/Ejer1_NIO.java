import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejer1_NIO {
    public static void main(String[] args) {
        Path path = Paths.get("Ejercicio1.txt"); //Definimos la ruta del archivo

        List<String> contenido = List.of("Trabajando el paquete java.nio");

        try {
            Files.write(path, contenido);
            System.out.println("Archivo guardado exitosamente");
            System.out.println("Nombre del archivo " + path.getFileName());

        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }


    }
}
