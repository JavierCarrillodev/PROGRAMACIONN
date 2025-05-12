import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
/*Ejercicio 7: Buscar una palabra en un archivo
Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.
*/
public class Ejer7 {
    public static void main(String[] args) {
        String archivo = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/copia.txt";

        BuscarPalabraYContar(archivo, "linea");
    }
    public static void BuscarPalabraYContar(String archivo, String palabraBuscada){
        int contador = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            Scanner scn = new Scanner(br);
            while (scn.hasNextLine()){
                String[] palabrasLinea = scn.nextLine().split("\\s+");
                for (String palabraActual:palabrasLinea){
                    if (palabraActual.equalsIgnoreCase(palabraBuscada)){
                        contador++;
                    }
                }
            }
            System.out.println("La palabra " + palabraBuscada + " sale " + contador + " veces");
            scn.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
