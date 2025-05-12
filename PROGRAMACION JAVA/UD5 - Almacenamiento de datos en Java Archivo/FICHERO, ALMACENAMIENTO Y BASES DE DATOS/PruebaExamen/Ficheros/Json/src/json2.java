import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class json2 {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            File archivo = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/personasss.json");

            List<Persona> personas = new ArrayList<>();
            if (archivo.exists()) {
                personas = mapper.readValue(archivo, new TypeReference<List<Persona>>() {});
            }
            // Crear nuevas instancias de Persona
            Persona nueva1 = new Persona("Javivivi", 21);
            Persona nueva2 = new Persona("Victoria", 19);

            // Verificar si ya existen en la lista antes de agregarlas
            if (!personas.contains(nueva1)) {
                personas.add(nueva1);
            }
            if (!personas.contains(nueva2)) {
                personas.add(nueva2);
            }

            // Guardar la lista actualizada
            mapper.writeValue(archivo, personas);

            // Leer las personas guardadas
            List<Persona> personasLeidas = mapper.readValue(archivo, new TypeReference<List<Persona>>() {});

            System.out.println("Lista de personas leída:");
            for (Persona p : personasLeidas) {
                System.out.println(mapper.writeValueAsString(p));
            }

        } catch (Exception e) {
            e.printStackTrace();  // Imprime el error real
        }
    }
}
