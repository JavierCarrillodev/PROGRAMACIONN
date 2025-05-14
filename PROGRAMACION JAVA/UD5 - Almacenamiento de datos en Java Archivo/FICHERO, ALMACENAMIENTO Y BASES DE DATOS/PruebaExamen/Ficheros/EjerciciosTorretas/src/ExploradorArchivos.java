import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ExploradorArchivos {
    public static void main(String[] args) {
        String ruta =("Ejercicio8/resources/explorador");
        listar(new File(ruta));
    }
    public static void listar(File ruta){


        if (ruta.isDirectory()) {
            File[] archivos = ruta.listFiles();
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    System.out.println(archivo.getPath());
                } else if (archivo.isDirectory()) {
                    listar(archivo);
                }
            }
        }
    }
}
