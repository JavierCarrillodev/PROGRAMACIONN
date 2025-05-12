import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class json {
    public static void main(String[] args) {

        try{
            ObjectMapper mapper = new ObjectMapper();

            Persona persona = new Persona("javi",22);

            mapper.writeValue(new File("persona.json"),persona);

            Persona persona2 = mapper.readValue(new File("persona.json"),Persona.class);

            System.out.println("JSON generado:\n" + mapper.writeValueAsString(persona));
            System.out.println("Nombre leído desde JSON: " + persona2.getNombre());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
