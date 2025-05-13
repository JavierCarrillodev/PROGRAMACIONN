import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordenadores {
    private int id;
    private String nombre;
    private String creador;

    public Ordenadores() {
    }

    public Ordenadores(int id, String nombre, String creador) {
        this.id = id;
        this.nombre = nombre;
        this.creador = creador;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Ordenadores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    private ArrayList<Ordenadores>ordenadores = new ArrayList<>();
    private String archivo = "CRUD-PERSISTENCIA/ordenadore.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    public void cargarOdenadores(){
        File file = new File(archivo);
        if (file.exists()){
            try{
                ordenadores = mapper.readValue(file, new TypeReference<ArrayList<Ordenadores>>() {
                });
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    public void guardarOrdenadores(){
        try{
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo),ordenadores);
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void crearOrdenadores(){
        System.out.println("Indica el id del ordenador");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Indica el nombre del pc");
        String nombre = sc.nextLine();
        System.out.println("Indica el creador del pc");
        String creador = sc.nextLine();
        ordenadores.add(new Ordenadores(id,nombre,creador));
        guardarOrdenadores();

    }

    public void leerOrdenadores(){
        System.out.println("Lista de ordenadores:");
        for (Ordenadores ordenador: ordenadores){
            System.out.println(ordenador);
        }
        System.out.println();
    }

    public void buscarOrdenadores(){
        System.out.println("Indica el nombre del ordenador para buscar");
        String nombre = sc.nextLine();
        for (Ordenadores ordenador: ordenadores){
            if (ordenador.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El ordenador buscado es " + nombre + " su id es: " + ordenador.getId() + " y su creador " + ordenador.getCreador());
                return;

            }
        }
        System.out.println("Nombre no encontrado");

    }

    public void actualizarOrdenador(){
        System.out.println("Indica el id del ordenador para actualizar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Ordenadores ordenador: ordenadores){
            if (ordenador.getId() == id){
                System.out.println("Introduce nuevo nombre para el pc");
                String nombreNuevo = sc.nextLine();
                ordenador.setNombre(nombreNuevo);
                System.out.println("Nombre cambiado correctamente");
                guardarOrdenadores();
                return;
            }
        }
        System.out.println("Id no encontrado");
    }

    public void eliminarOrdenador(){
        System.out.println("Indica el id del ordenador para borrar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Ordenadores ordenador: ordenadores){
            if (ordenador.getId() == id){
                ordenadores.remove(ordenador);
                guardarOrdenadores();
                return;
            }
        }
        System.out.println("Id no encontrado");
    }
}
