import javax.swing.text.Element;
import java.io.BufferedReader;
import java.io.FileReader;

/*Ejercicio 5: Contar palabras en un archivo
Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola. */
public class Ejer5 {
    public static void main(String[] args) {

        String ruta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
    }
    public static void ContarPalabras(String ruta){
        try {
        int contador = 0;
        BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null){
                String[] palabras = linea.trim().split("\\s+");
                contador += palabras.length;
            }

            System.out.println("El numero total de palabras son " + contador);

        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }
}
