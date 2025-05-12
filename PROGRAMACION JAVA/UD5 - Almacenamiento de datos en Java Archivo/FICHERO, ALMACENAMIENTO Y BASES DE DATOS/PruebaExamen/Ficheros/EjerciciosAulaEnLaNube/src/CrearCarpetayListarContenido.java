import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearCarpetayListarContenido {
    public static void main(String[] args) {
        File directorio =  new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/CarpetaEjercicio");
        if (!directorio.exists()){
            directorio.mkdir();
            System.out.println("Carpeta creada");
        }else {
            System.out.println("La carpeta ya existe error");
        }

        String fichero = ("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/CarpetaEjercicio/hola.txt");
        try {
            File archivo = new File(fichero);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        }catch (IOException e){
            System.out.println("Error");
        }
        String carpeta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/CarpetaEjercicio";

        CrearCarpeta(new File(carpeta));
    }

    public static void CrearCarpeta(File carpeta){
        if(carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles();

            for(File archivo:archivos){
                if(archivo.isFile() && archivo.getName().endsWith(".txt")){
                    System.out.println(archivo.getPath());
                } else if (archivo.isDirectory()) {
                    CrearCarpeta(archivo);

                }
            }

        }

    }
}
