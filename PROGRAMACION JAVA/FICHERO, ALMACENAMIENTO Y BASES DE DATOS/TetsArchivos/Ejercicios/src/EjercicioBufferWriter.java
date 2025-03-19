import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*CREA UN METODO QUE RECIBA EL NOMBRE DE UN ARCHIVO, Y UN ENTERO. EL METODO DEBERA CREAR EL ARCHIVO Y ESCRIBIR
N LINEAS DENTRO. CADA LINEA DEBERA TENER ESCRITO "ESTA ES LA LINEA N", SUSTITUYENDO 'N' POR EL NUMERO DE LA LINEA. UTILIZA UN
BUFFER PARA REALIZAR LA ESCRITURA DE FORMA MAS EFICIENTES.*/
public class EjercicioBufferWriter {
    public static void main(String[] args) {
        String nombreFichero = "ficheroN.txt";
        int numLineas = 20;
        crearLineas(nombreFichero, numLineas);
    }
    public static void crearLineas(String nombreFichero, int numlineas) {

        try {
            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 1; i <= numlineas; i++) {
                bw.write( "Esta es la linea: " + i);
                bw.newLine();
            }
            // al cerrar el BufferWriter se cierra tambien el FileWriter
            bw.close();
            System.out.println("Archivo " + nombreFichero + " ha sido creado con " + numlineas + " lineas" );

        }catch (IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }

    }
}
