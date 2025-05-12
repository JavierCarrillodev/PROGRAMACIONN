import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* Crea un metodo que reciba el nombre de un archivo, y un entero. El metodo debera crear el archivo y escribir 'n
lineas dentro. Cada linea deberia tener escrito "Estas es la lina n", sustituyendo 'n' por el numero de la linea.
Utiliza un buffer para realizar la escritura de forma mas eficiente.*/
public class EjercicioBufferedWriter {
    public static void main(String[] args) {
        String nombreFichero = "nuevoArchivo.txt";
        int numLineas = 100;

        CrearLineas(nombreFichero,numLineas);
    }

    public static void CrearLineas(String nombreFichero, int numLineas) {
        try{

            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i <= numLineas ; i++) {
                bw.write("Esta es la linea " + i);
                bw.newLine();
            }
            bw.close();
            System.out.println(nombreFichero + " creado con " + numLineas + "lineas ");

        } catch (IOException e) {
            System.out.println("Error");

        }


    }
}
