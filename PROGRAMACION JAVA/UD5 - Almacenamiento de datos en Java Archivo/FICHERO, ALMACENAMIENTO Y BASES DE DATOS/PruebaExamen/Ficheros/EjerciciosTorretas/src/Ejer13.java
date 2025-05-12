import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*Ejercicio 13: Copiar un archivo binario (imagen o vídeo)
Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.*/
public class Ejer13 {
    public static void main(String[] args) {

        Path origen = Paths.get("/home/javi/Escritorio/PruebaExamen/Ficheros/Sorprendido.png");
        Path destino = Paths.get("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/Sorprendido.png");
    }
    public static void CopiarImagen(Path origen, Path destino){
        try {
            Files.copy(origen,destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copiado con exito");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
