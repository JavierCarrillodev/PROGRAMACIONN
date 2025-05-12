import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class buscar {
    public static void main(String[] args) {
    String fichero = "/home/javi/Escritorio/PruebaExamen/Ficheros/ejemplo1.txt";

    BuscarPalabra(fichero,"nueva");

    }

    public static void BuscarPalabra(String fichero, String palabraBuscada){
        int contador = 0;
        try{
       BufferedReader br = new BufferedReader(new FileReader(fichero));
       Scanner scn = new Scanner(br);
       while (scn.hasNextLine()){
           String[] palabralinea = scn.nextLine().split("\\s+");
           for (String palabraActual:palabralinea){
               if (palabraActual.equalsIgnoreCase(palabraBuscada)){
                   contador++;
               }
           }
       }
       scn.close();
            System.out.println("La palabra encontrada es \"" + palabraBuscada + "\" y se repite " + contador + " veces");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
