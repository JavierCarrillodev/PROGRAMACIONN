import java.io.*;
import java.util.Scanner;

public class EjemploPrintWriter2 {
    public static void main(String[] args) {

        String frase = "dasdsad";
        String nombreFichero = "ficheroEnteros.txt";

        try{

            PrintWriter pwr = new PrintWriter(nombreFichero);

            for (int i = 1; i < 1000; i++) {
                pwr.print(i + " ");
                if (i % 100 == 0) {
                    pwr.println();
                    pwr.println(frase);
                }
            }
            pwr.close();

            Scanner sc = new Scanner(new FileReader(nombreFichero));
            //PREGUNTAR DUDA A ALEJNADRO
            while (sc.hasNextInt()) { /*Le pongo hasNextInt para que cuando lea que no es un entero se lo salte y siga
            leyendo entero*/
                System.out.println("Valor leido: " + sc.nextInt());
                // OTRA FORMA DE HACERLO:
                /*  if (sc.hasNextInt()) System.out.println("Valor leido: " + sc.nextInt());
                else sc.next();*/
            }
            sc.close();

        }catch (IOException e){
            System.out.println("Problema en el archivo");
        }
    }
}
