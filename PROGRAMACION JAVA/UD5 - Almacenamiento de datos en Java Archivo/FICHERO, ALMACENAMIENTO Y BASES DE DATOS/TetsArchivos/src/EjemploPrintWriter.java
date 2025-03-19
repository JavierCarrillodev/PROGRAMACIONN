import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploPrintWriter {
    public static void main(String[] args) {
        String ejemplo = "ejemplo.txt";

        try{
            PrintWriter pw;

            pw = new PrintWriter(new FileWriter(ejemplo,true));/*Con esto lo que hacemos es no machacar lo que ya
            tenemos en un archivo*/
            //pw = new PrintWriter(new PrintWriter(ejemplo)); Y sin el true si se macha
            pw.print("Esto es un ejemplo sin salto de linea");
            pw.println("NUEVA PALABRA");
            pw.println("Esto es un ejemplo con salto de linea");
            pw.println(4.555);

            // para repasar programacion funcional
            Arrays.stream(new int[]{1,2,3,4,10})
                    .filter(x -> x > 2)
                    .map(x -> x * 2)
                    .forEach(x -> pw.println(x));
            pw.close();

        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }catch (IOException e){
            System.out.println("ERROR al crear el fichero");
        }
    }
}
