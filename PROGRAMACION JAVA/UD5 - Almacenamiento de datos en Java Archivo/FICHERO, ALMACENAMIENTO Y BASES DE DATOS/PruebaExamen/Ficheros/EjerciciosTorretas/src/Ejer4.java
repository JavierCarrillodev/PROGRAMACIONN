import java.io.BufferedWriter;
import java.io.FileWriter;

/* Ejercicio 4: Agregar contenido a un archivo
Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.*/
public class Ejer4 {
    public static void main(String[] args) {
        String ruta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt";
    }
    public static void AgregarContenido(String ruta){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta,true));
            bw.write("Esto es un texto sin borrar al enterior\n");
            bw.close();

        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }
}
