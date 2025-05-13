import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class seriali {
    public static void main(String[] args) {

        try {
            String archivo = "/home/javi/Escritorio/PruebaExamen/Ficheros/persona.json";
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo));

            Persona p = (Persona) in.readObject();
            in.close();
            System.out.println("Persona leida " + p);

            System.out.println("Deserializado");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
