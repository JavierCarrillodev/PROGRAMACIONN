import java.io.BufferedReader;
import java.io.FileReader;
/*Ejercicio 8: Contar la cantidad de líneas en un archivo
Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.
*/
public class Ejer8 {
    public static void main(String[] args) {

        String fichero = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
    }
    public static void ContarCanidadDeLinea(String fichero){

        try{
            int contador = 0;

            BufferedReader br = new BufferedReader(new FileReader(fichero));
            while ((br.readLine()) != null){
                contador++;
            }
            System.out.println("El archivo tiene " + contador + " lineas");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
