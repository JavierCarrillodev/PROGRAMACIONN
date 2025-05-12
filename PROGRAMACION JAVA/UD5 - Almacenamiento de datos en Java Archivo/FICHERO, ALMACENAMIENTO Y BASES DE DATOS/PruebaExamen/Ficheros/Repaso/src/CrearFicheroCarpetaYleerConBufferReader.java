import javax.swing.*;
import java.io.*;

public class CrearFicheroCarpetaYleerConBufferReader {
    public static void main(String[] args) {
        /*try{
            File carpeta = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/Repaso/DirectorioRepaso");
            if(!carpeta.exists()){
                carpeta.mkdir();
                System.out.println("Carpeta creada correctamente");
            }else{
                System.out.println("Fallo al crear la carperta");
            }
             } catch (Exception e) {
            System.out.println("Error");
        }
         */

        String fichero1 = "/home/javi/Escritorio/PruebaExamen/Ficheros/Repaso/src/archivito.txt";
            try{
                File archivo = new File(fichero1);
                if(!archivo.exists()){
                    archivo.createNewFile();
                    System.out.println("El archivo fue creado");
                }else{
                    System.out.println("Archivo no se pudo crear");
                }

            } catch (Exception e) {
                System.out.println("Error al crear archivo");
            }

            String fichero2 = "/home/javi/Escritorio/PruebaExamen/Ficheros/Repaso/src/ficheroloco.txt";
            String texto = "Hola buenos dias\n";

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fichero2,true));
                bw.write(texto);
                bw.write("Eso es un nuevo texto\n");
                bw.close();

            } catch (Exception e) {
                System.out.println("Error");
            }

            String fichero3 = "/home/javi/Escritorio/PruebaExamen/Ficheros/Repaso/src/ficheroloco.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero3));

            System.out.println("El contenido del fichero " + fichero3 + " es: ");
            int caracter;
            while ((caracter = br.read()) != -1){
                System.out.print((char) caracter);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

        String rutaCarpeta = (".");
        listarArchivosCarpeta(new File(rutaCarpeta));
    }
    //Lista archivos
    public static void listarArchivosCarpeta(File carpeta){
        if (carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles();

            for (File archivo : archivos){
                if (archivo.isFile() && archivo.getName().endsWith(".txt")){
                    System.out.println(archivo.getPath());
                } else if (archivo.isDirectory()) {
                    listarArchivosCarpeta(archivo);

                }
            }

        }
    }
}
