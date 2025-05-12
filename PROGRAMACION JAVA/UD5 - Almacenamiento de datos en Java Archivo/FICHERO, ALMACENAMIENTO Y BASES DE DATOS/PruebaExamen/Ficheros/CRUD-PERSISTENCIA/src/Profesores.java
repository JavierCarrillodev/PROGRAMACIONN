import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Profesores {
    private int id;
    private String nombre;
    private int edad;

    public Profesores() {
    }

    public Profesores(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "profesores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    private ArrayList<Profesores> profesores = new ArrayList<>();
    private String archivo = "CRUD-PERSISTENCIA/profesores.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    //Cargar profesores
    public void cargarProfesores(){
        File file = new File(archivo);
        if (file.exists()){
            try {
                profesores = mapper.readValue(file, new TypeReference<ArrayList<Profesores>>() {
                });

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    //Guardar JSON
    public  void guardarProfesores(){
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo),profesores);
        }catch (Exception e) {
            System.out.println("Error");
        }
    }
    //Crear profesores
    public void crearProfesores(){
        System.out.println("Introduce el id para crear al profesor");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el nombre para del profesor");
        String nombre = sc.nextLine();

        System.out.println("Introduce la edad para del profesor");
        int edad = sc.nextInt();
        sc.nextLine();

        profesores.add(new Profesores(id,nombre,edad));
        guardarProfesores();
        System.out.println("Profesor creado y guardado");
    }

    //Listar profesores
    public void leerProfesore(){
        System.out.println("Lista de profesores");
        for (Profesores profesor: profesores){
            System.out.println(profesor);
        }
        System.out.println();
    }

    //Actualizar Profesores
    public void actualizarProfesor(){
        System.out.println("Introduce el id del profesor que quieras actualizar");
        int id = sc.nextInt();
        sc.nextLine();
        for (Profesores profesor: profesores){
            if (profesor.getId() == id){
                System.out.println("Introduce el nombre nuevo que quieras actualizar");
                String nombreNuevo = sc.nextLine();
                profesor.setNombre(nombreNuevo);
                guardarProfesores();
                System.out.println("Nombre actualizado y guardado");
                return;
            }
        }
        System.out.println("Id no encontrado");
    }

    //Eliminar profesor
    public void eliminarProfesor(){
        System.out.println("Indica el id del profesor para borrar");
        int id = sc.nextInt();
        sc.nextLine();
        for (Profesores profesor:profesores){
            if (profesor.getId() == id){
                profesores.remove(profesor);
                guardarProfesores();
                System.out.println("Profesor eliminado correctamente");
                return;
            }

        }
        System.out.println("Id no encontrado");
    }
}
