import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

/*CREA UN METODO QUE RECIBA EL NOMBRE DE UN ARCHIVO, Y UN ENTERO. EL METODO DEBERA CREAR EL ARCHIVO Y ESCRIBIR
N LINEAS DENTRO. CADA LINEA DEBERA TENER ESCRITO "ESTA ES LA LINEA N", SUSTITUYENDO 'N' POR EL NUMERO DE LA LINEA. UTILIZA UN
BUFFER PARA REALIZAR LA ESCRITURA DE FORMA MAS EFICIENTES.*/
public class EjercicioBufferWriter {
    public static void main(String[] args) {

        String ficheroN = "ficheroN.txt";

        try {
            PrintWriter pw = new PrintWriter(new PrintWriter(ficheroN));
            for (int i = 1; i <= 20; i++) {
                pw.println( "Esta es la linea: " + i);
            }
            pw.close();

        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero " + ficheroN);
        }

    }
}
