import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LeerPersona {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("PERSONA.DAT"));
            Persona p = (Persona) in.readObject();
            in.close();
            System.out.println("Ojeto leido: " + p);

        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
