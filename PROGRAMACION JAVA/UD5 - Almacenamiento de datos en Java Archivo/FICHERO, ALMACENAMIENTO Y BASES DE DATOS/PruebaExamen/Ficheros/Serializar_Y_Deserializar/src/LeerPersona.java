import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerPersona {
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("PersonasGuays.dat"));
            List<Persona> personas = (List<Persona>) in.readObject();
            in.close();
            System.out.println("Objeto leido:");
            for (Persona persona:personas){
                System.out.println(persona);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
