import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NArchivos {
    public static void main(String[] args) {


        /*Crear N archivos, nombre(1).txt, nombre(2).txt... nombre(n).txt

         en la carperta que se solicita el usuario. Dentro de cada archivo debe escribirse la palabra frase
         "Este es el fichero nombre(n).stxt"*/

        String nombreBase;
        String rutaCarpeta;
        int numArchivos;
        Scanner sc = new Scanner(System.in);

        //Solicita al usuaroi la carpeeta donde se crearan los archivos
        System.out.println("Ingrese la ruta de la carpeta donde se creara el archivo");
        rutaCarpeta = sc.nextLine();
        //Solicitar el nombre base de los archivos
        System.out.println("Ingrese el nombre base de los archivos");
        nombreBase = sc.nextLine();
        //Solicitar los archivos a crear
        System.out.println("Ingrese el numero de archivos a crear");
        numArchivos = sc.nextInt();

        System.out.println(".....................................................");

        crearArchivosMultiples(rutaCarpeta, nombreBase, numArchivos);
        sc.close();
    }
       public static void crearArchivosMultiples(String rutaCarpeta, String nombreBase, int numArchivos) {
           File carpeta = new File(rutaCarpeta);
           if (!carpeta.exists()) {
               carpeta.mkdir();
           }

           //Crear archivos
           for (int i = 0; i < numArchivos; i++) {
               String nombreArchivo = nombreBase + "(" + i + ").txt";
               File archivo = new File(carpeta, nombreArchivo);


               try {
                   FileWriter escribir = new FileWriter(nombreArchivo);
                   escribir.write("Este es el fichero" + numArchivos);
                   System.out.println("El archivo se ha guardado correctamente " + archivo.getAbsolutePath());
                   escribir.close();


               } catch (IOException e) {
                   System.out.println("ERROR" + e.getMessage());
               }
           }
       }
}



