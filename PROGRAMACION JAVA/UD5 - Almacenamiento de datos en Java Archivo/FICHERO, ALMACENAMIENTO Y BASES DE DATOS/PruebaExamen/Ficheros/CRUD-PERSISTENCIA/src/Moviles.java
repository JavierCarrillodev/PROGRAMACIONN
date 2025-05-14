import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Moviles {
    private int id;
    private String propietario;
    private boolean robado;

    public Moviles() {
    }

    public Moviles(int id, String propietario, boolean robado) {
        this.id = id;
        this.propietario = propietario;
        this.robado = robado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean isRobado() {
        return robado;
    }

    public void setRobado(boolean robado) {
        this.robado = robado;
    }

    @Override
    public String toString() {
        return "Moviles{" +
                "id=" + id +
                ", propietario='" + propietario + '\'' +
                ", robado=" + robado +
                '}';
    }

    private ArrayList<Moviles>moviles = new ArrayList<>();
    private String archivo = "CRUD-PERSISTENCIA/moviles.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    public void cargarMoviles(){
        File files = new File(archivo);
        if (files.exists()){
            try{
                moviles = mapper.readValue(files, new TypeReference<ArrayList<Moviles>>() {
                });
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    public void guardarMoviles(){
        try{
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo),moviles);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void crearMoviles(){
        System.out.println("Indica el id del movil que quieras crear");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Indica el propietario del movil que quieras crear");
        String propietario = sc.nextLine();

        System.out.println("Indica si el movil es robado o no");
        boolean robado = sc.nextBoolean();

        moviles.add(new Moviles(id,propietario,robado));
        guardarMoviles();
    }

    public void listarMoviles(){
        System.out.println("Lista de moviles");
        for (Moviles moviles:moviles){
            System.out.println(moviles);
        }
    }
    public void buscarMoviles(){
        System.out.println("Indica el id del movil que quieras buscar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Moviles movil:moviles){
            if (movil.getId() == id){
                System.out.println("El movil que has buscado tiene el id: " + id + " su propietario es " + movil.getPropietario() + " es robado? " + movil.isRobado());
                return;
            }
        }
        System.out.println("Id no ecnontrado");
    }

    public void actualizarMoviles(){
        System.out.println("Introduce el propietario que le quieras cambiar el nombre");
        String propietario= sc.nextLine();

        for (Moviles movil:moviles){
            if (movil.getPropietario().equalsIgnoreCase(propietario)){
                System.out.println("Indica el nuevo nombre que le quieras poner");
                String propietarioNuevo= sc.nextLine();
                movil.setPropietario(propietarioNuevo);
                guardarMoviles();
                return;

            }
        }
    }

    public void eliminarMovil(){
        System.out.println("Indica el id del movil que quieras borrar");
        int id = sc.nextInt();
        sc.nextLine();

        for (Moviles movil:moviles) {
            if (movil.getId() == id) {
                moviles.remove(movil);
                guardarMoviles();
                return;
            }
        }
        System.out.println("Id no ecnontrado");
    }
}
