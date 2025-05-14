import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class GuardarPersona {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Javi",21));
        personas.add(new Persona("pepe",21));
        personas.add(new Persona("oscar",21));
        personas.add(new Persona("Paula",21));

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PersonasGuays.dat"));
            out.writeObject(personas);
            out.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
