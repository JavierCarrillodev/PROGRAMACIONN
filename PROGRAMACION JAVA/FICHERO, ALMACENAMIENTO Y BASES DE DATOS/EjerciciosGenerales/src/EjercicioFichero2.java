
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioFichero2 {
    public static void main(String[] args) {
        String filename = "/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS/EjerciciosGenerales/src/alumnos_Notas.txt";
        try {
            List<Alumno> alumnos = calcularNotasMedias(filename);
            alumnos.sort(Comparator.comparingDouble(Alumno::getNotaMedia).reversed());
            alumnos.forEach(alumno -> System.out.println(alumno.getNombre() + " " + alumno.getApellido() + ": " + alumno.getNotaMedia()));
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static List<Alumno> calcularNotasMedias(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.lines()
                    .map(line -> line.split(" "))
                    .filter(parts -> parts.length >= 3)
                    .map(parts -> {
                        String nombre = parts[0];
                        String apellido = parts[1];
                        double notaMedia = java.util.Arrays.stream(parts, 2, parts.length)
                                .mapToInt(Integer::parseInt)
                                .average()
                                .orElse(0.0);
                        return new Alumno(nombre, apellido, notaMedia);
                    })
                    .collect(Collectors.toList());
        }
    }
}