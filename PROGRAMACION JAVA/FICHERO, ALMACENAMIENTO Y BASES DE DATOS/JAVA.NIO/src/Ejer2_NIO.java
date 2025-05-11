import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejer2_NIO {
    public static void main(String[] args) {
        Path path = Paths.get("Ejercicio1.txt");

        try {
            List<String> lineas = Files.readAllLines(path);

            //Imprime cada linea por consola
            lineas.forEach(linea -> System.out.println(linea));


        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
