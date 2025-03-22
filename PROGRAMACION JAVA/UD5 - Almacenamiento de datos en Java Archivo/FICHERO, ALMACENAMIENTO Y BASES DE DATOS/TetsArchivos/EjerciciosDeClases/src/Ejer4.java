import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Ejercicio 4: Agregar contenido a un archivo**
Modifica el archivo `datos.txt` para agregar nuevas líneas de texto sin borrar el contenido anterior.*/
public class Ejer4 {
    public static void main(String[] args) {
        String fichero = "";
        String linea = "";
        AgregarContenidoArchivo(fichero,linea);
    }
    public static void AgregarContenidoArchivo(String fichero,String linea){
        try {
            FileWriter fw = new FileWriter(fichero,true);
            BufferedWriter bw = new BufferedWriter(fw);

            fw.write(linea);

            fw.close();

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());

        }


    }
}

