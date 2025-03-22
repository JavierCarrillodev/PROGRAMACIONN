import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Ejercicio 13: Copiar un archivo binario (imagen o vídeo)
 Crea un programa que copie un archivo binario (por ejemplo, una imagen `.jpg` o un vídeo `.mp4`) de un directorio a otro sin modificar su contenido.
*/
public class Ejer13 {
    public static void main(String[] args) {
        // Ruta del archivo de origen y destino

        String archivoOrigen = "/home/javi/Imágenes/pro.png";
        String archivoDestino = "/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/copia.txt";

        // Llamamos al metodo para copiar el archivo
        copiarArchivoBinario(archivoOrigen, archivoDestino);
    }
    public static void copiarArchivoBinario(String archivoOrigen, String archivoDestino) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Abrimos el archivo de origen en modo de lectura binaria
            fis = new FileInputStream(new File(archivoOrigen));

            // Abrimos el archivo de destino en modo de escritura binaria
            fos = new FileOutputStream(new File(archivoDestino));

            // Creamos un buffer para almacenar temporalmente los datos del archivo
            byte[] buffer = new byte[1024];
            int bytesleidos;

            while ((bytesleidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesleidos);
            }
            System.out.println("Archivo copiado exitosamente");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();

            } catch (IOException e) {
                System.out.println("Error al cerrar los flujos " + e.getMessage());
            }
        }
    }
}
