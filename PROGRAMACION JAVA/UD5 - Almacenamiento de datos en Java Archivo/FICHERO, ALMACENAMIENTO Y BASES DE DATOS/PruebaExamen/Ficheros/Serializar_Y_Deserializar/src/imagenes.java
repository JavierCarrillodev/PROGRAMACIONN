import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;

public class imagenes {
    public static void main(String[] args) {
        String origen = "/home/javi/Escritorio/PruebaExamen/Ficheros/Serializar_Y_Deserializar/src/Sorprendido.png";
        String destino = "/home/javi/Escritorio/PruebaExamen/Ficheros/Serializar_Y_Deserializar/Sorprendido.png";

        try{
            FileInputStream in = new FileInputStream(origen);
            FileOutputStream out = new FileOutputStream(destino);

            byte[] buffer = new byte[1024];
            int longitud;
            while ((longitud = in.read()) > 0){
                out.write(buffer,0,longitud);
            }

            System.out.println("Imagen copiada");


        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
