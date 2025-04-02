import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Implementa un programa que pida al usuario un nombre de archivo A para lectura
 y otro nombre de archivo B para escritura. Leerá el contenido del archivo A (por ejemplo 'usa_personas.txt')
 y lo escribirá ordenado alfabéticamente en B (por ejemplo 'usa_personas_sorted.txt').*/
public class Ejer3 {
    public static void main(String[] args) {
        String archivoOrigen = "/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/src/usa_personas.txt";

        String archivoDestino ="/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/src/usa_personas_sorted.txt";
        try {
            //Leemos el archivo
            BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
            List<String> lineas = new ArrayList<>();
            String linea;

            while ((linea = br.readLine()) != null) {
               lineas.add(linea);
            }
            br.close();

            Collections.sort(lineas);
            // copiar el archivo filename a archivo copiar
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino,true));
            for (String a : lineas){
                bw.write(a);
                bw.newLine();
            }
            bw.close();

            System.out.println("Archivo copiado y ordenado correctamente");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }

}
