import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*Ejercicio 11: Listar archivos en un directorio
Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.*/
public class Ejer11 {
    public static void main(String[] args) {
        String carpeta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas";
        ListarArchivos(new File(carpeta));
    }
    public static void ListarArchivos(File carpeta){
            if (carpeta.isDirectory()){
                File[] archivos = carpeta.listFiles();
                for (File archivo : archivos){
                    if (archivo.isFile()){
                        System.out.println(archivo.getPath());
                    } else if (archivo.isDirectory()) {
                        ListarArchivos(archivo);

                    }
                }
            }



    }
}
