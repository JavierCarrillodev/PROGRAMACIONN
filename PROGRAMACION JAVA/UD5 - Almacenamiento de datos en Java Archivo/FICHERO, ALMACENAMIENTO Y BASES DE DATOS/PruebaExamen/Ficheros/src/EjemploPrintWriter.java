import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Arrays;


public class EjemploPrintWriter {
    public static void main(String[] args) {

        String fichero = "ejemplo1.txt";

        try{
            PrintWriter pw;

            pw = new PrintWriter(new FileWriter(fichero,true));
            pw.print("Esto es un texto sin salto de linea");
            pw.println("Nueva palabra");
            pw.println("Esto es un texto con salto de linea");
            pw.println(4.5455);

            // para repasar programacion funcional
            Arrays.stream(new int[] {1,2,3,4,10})
                    .filter(n -> n > 2)
                    .map(n -> n * 2)
                    .forEach(n -> pw.println(n));
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
        }
    }
}
