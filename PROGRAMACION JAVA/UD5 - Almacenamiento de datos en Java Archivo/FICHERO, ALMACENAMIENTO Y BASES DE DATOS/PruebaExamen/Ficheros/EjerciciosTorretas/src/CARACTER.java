import java.io.*;

public class CARACTER {
    public static void main(String[] args) {
        String carpeta = ".";
        Listar(new File(carpeta));
    }
    public static void Listar(File carpeta){
        if (carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles();
            for (File archivo: archivos){
                if (archivo.isFile()&& archivo.getPath().endsWith(".txt")){
                    System.out.println(archivo.getPath());
                } else if (archivo.isDirectory()) {
                    Listar(archivo);

                }
            }
        }
    }
}

