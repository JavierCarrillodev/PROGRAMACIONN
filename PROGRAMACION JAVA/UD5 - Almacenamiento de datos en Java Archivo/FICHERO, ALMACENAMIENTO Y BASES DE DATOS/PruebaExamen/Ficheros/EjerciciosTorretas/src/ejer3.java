import java.io.BufferedReader;
import java.io.FileReader;

/* Ejercicio 3: Leer un archivo línea por línea
Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.

*/
public class ejer3 {
    public static void main(String[] args) {

        String ruta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
    }
    public static void LeerLineaPorLinea(String ruta){
       try{
           int contador = 0;
           String linea;
           BufferedReader br = new BufferedReader(new FileReader(ruta));
           while ((linea = br.readLine()) !=null){
               contador ++;
               System.out.println(linea);
           }
           System.out.println("Hay " + contador + " lineas" );
       } catch (Exception e) {
           System.out.println("ERROR");
       }

    }
}
