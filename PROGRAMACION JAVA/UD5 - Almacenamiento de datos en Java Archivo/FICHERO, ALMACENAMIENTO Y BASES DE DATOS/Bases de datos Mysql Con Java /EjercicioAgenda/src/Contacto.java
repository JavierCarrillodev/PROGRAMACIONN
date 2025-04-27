import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacto {

    private String nombre;
    private int telefono;
    private String email;

    public Contacto() {
    }

    public Contacto(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void agregarContacto(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre: ");
        String nombreContacto = sc.nextLine();

        System.out.println("Inroduce teléfono: ");
        int tlfContacto = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce email: ");
        String emailContacto = sc.nextLine();

        Contacto contacto = new Contacto(nombreContacto, tlfContacto, emailContacto);
        contactos.add(contacto);
    }

    public static void eliminarContacto(List<Contacto> contactos, File archivoJSON){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del contacto a eliminar: ");
        String nombreEliminar = sc.nextLine();

        boolean encontrado = false;

        for (Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombreEliminar)){
                contactos.remove(c);
                System.out.println("Contacto eliminado con éxito.");
                encontrado = true;
                guardarJSON(contactos,archivoJSON);
                break;
            }
        }

        if (!encontrado){
            System.out.println("El contacto no está en la lista.");
        }
    }

    public static void buscarContacto(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del contacto a buscar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontradoBusqueda = false;

        for (Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombreBuscar)){
                System.out.println(c);
                encontradoBusqueda = true;
                break;
            }
        }

        if (!encontradoBusqueda){
            System.out.println("El contacto no está en la lista.");
        }
    }

    public static void listarTodosContactos(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Listando todos los contactos: ");

        if(contactos.isEmpty()){
            System.out.println("No hay contactos");
        }
        for (Contacto c : contactos){
            System.out.println(c);
        }
    }

    public static void guardarJSON(List<Contacto> contactos, File archivoJSON){
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();


        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJSON, contactos);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static List<Contacto> recuperarContactos(File archivoJSON) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacto> contactosRecuperados;

        if (archivoJSON.exists()){
            contactosRecuperados = mapper.readValue(archivoJSON, new TypeReference<List<Contacto>>() {});
        }else {
            contactosRecuperados = new ArrayList<>();
        }

        return contactosRecuperados;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", telefono: " + telefono + ", email: " + email;
    }
}
