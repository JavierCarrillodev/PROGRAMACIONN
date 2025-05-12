import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copiarcontenido {
    public static void main(String[] args) {
        Path origen = Paths.get("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt");
        Path destino = Paths.get("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/copia.txt");

        try{
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copiado con exito");


        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
