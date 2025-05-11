import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearFicheroRuta {
    public static void main(String[] args) {
        String nombreArchivo = "/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/pruebaDirectorio/Prueba.txt";
        String contenidoFichero = "Esto es el contenido del fichero que esta dentro del directorio pruebaDirectorio\n";
        File archivo = new File(nombreArchivo);
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("El fichero se ha creado con exito");
            }else {
                System.out.println("El fichero no se ha creado correctamente");
            }
            BufferedWriter bw = new BufferedWriter( new FileWriter(archivo,true));
            bw.write(contenidoFichero);
            bw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
