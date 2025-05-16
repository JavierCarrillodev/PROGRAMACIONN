import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class json {
    public static void main(String[] args) {

        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Persona>personas = new ArrayList<>();
            personas.add(new Persona("Javi",21));
            personas.add(new Persona("oscar",19));



        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
