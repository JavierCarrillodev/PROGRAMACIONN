import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class GuardarPersona {
    public static void main(String[] args) {
     Persona p = new Persona("Victoria",19);

     try{
     ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PERSONA.DAT"));
     out.writeObject(p);
     out.close();
         System.out.println("Serializado");

     } catch (Exception e) {
         System.out.println("Error");
     }
    }
}
