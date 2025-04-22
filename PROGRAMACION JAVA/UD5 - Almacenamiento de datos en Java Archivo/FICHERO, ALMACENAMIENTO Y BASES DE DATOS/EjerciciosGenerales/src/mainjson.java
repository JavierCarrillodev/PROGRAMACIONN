/*import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class mainjson {
    public static void main(String[] args) throws IOException {

        // Crear un usuario
        Usuario user = new Usuario("Pepe", "pepe@gmail.com", 20);

        // Crear el objeto ObjectMapper para convertir entre objetos Java y JSON
        ObjectMapper mapper = new ObjectMapper();

        // Convertir el objeto a JSON y guardarlo en un archivo
        mapper.writeValue(new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/prueba.json"), user);
        System.out.println("Usuario guardado en JSON: " + user);

        // Leer el JSON y convertirlo en un arreglo de objetos Usuario
        Usuario[] userFromFile = mapper.readValue(new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/src/javausuario.json"), Usuario[].class);

        // Mostrar cada usuario leido desde el archivo
        for (Usuario u : userFromFile) {
            System.out.println("Usuario leído desde JSON: " + u);
            if (u.getEdad() < 18) {
                System.out.println("Es menor de edad");
            } else {
                System.out.println("Es mayor de edad");
            }
        }
    }
}
*/