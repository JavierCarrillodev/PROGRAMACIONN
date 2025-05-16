import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeserializarImagen {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("Serializar_Y_Deserializar/src/Sorprendido.dat")
            );
            byte[] datos = (byte[]) ois.readObject();
            ois.close();

            Path salida = Paths.get("Serializar_Y_Deserializar/src/Sorprendido_recuperado.png");
            Files.write(salida, datos);

            System.out.println("Imagen deserializada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar: " + e.getMessage());
        }
    }
}
