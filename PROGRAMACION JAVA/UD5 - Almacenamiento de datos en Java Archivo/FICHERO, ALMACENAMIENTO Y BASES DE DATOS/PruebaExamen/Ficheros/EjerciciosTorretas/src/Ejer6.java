import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/*Ejercicio 6: Copiar el contenido de un archivo a otro
Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.
 */
public class Ejer6 {
    public static void main(String[] args) {


        File archivo = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/copia.txt");
        String origen = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
        String destino = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/copia.txt";

    }
    public static void CopiarContenidoDeUnArchivoAOtro(File archivo,String origen,String destino){

       try{
           if (!archivo.exists()) {
               archivo.createNewFile();
               System.out.println("Archivo creado correctamente");
           }


            BufferedReader br = new BufferedReader(new FileReader(origen));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino,true));//Para no sobrescribir datos

            String linea;
            while ((linea = br.readLine()) !=  null){
               bw.write(linea);
               bw.newLine();
            }
            bw.close();
            br.close();
            System.out.println("Archivo copiado correctamente");

        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }
}
