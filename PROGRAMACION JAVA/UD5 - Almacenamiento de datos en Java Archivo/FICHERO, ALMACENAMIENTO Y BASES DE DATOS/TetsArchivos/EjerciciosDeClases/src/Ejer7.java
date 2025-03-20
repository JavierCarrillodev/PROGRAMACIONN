import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* Ejercicio 7: Buscar una palabra en un archivo**
 Escribe un programa que busque una palabra específica dentro del archivo `datos.txt` e indique cuántas veces aparece.*/
public class Ejer7 {
    public static void main(String[] args) {
        cantidadPalabras (  "datos.txt", "Hola");
    }
    public static void cantidadPalabras(String nombreArchivo, String palabraBuscada) {
        int contador = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            Scanner sc = new Scanner(br);
            while (sc.hasNextLine()) {
                String[] palabrasLinea = sc.nextLine().split(" ");
                for (String palabraActual :palabrasLinea) {
                    if (palabraActual.equals(palabraBuscada)){
                        contador++;
                    }
                }
            }
            sc.close();
        }catch (IOException e){
            System.out.println("No se puede leer" + e.getMessage());
        }
        System.out.println("La palabra " + palabraBuscada + " sale " + contador + " veces " + "en el archivo " + nombreArchivo);

    }
}
