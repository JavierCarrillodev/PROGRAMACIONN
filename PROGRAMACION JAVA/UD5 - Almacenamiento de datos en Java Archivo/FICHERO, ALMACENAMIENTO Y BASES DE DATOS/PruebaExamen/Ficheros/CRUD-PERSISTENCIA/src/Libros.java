import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libros {
    private String titulo;
    private String autor;
    private int anio;

    public Libros() {
    }

    public Libros(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                '}';
    }

    private ArrayList<Libros>libros = new ArrayList<>();
    private String archivo = "CRUD-PERSISTENCIA/libros.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    public void cargarLibros(){
        File file = new File(archivo);
        if (file.exists()){
            try{
                libros = mapper.readValue(file, new TypeReference<ArrayList<Libros>>() {
                });
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    public void guardarLibros(){
        try{
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo),libros);
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

    public void crearLibros(){
        System.out.println("Ingresa el titulo del libro que quieres crear");
        String titulo = sc.nextLine();

        System.out.println("Ingresa el autor del libro que quieres crear");
        String autor = sc.nextLine();

        System.out.println("Ingresa el año del libro que quieres crear");
        int anio = sc.nextInt();
        sc.nextLine();

        libros.add(new Libros(titulo,autor,anio));
        guardarLibros();

    }

    public void eliminarLibros(){
        System.out.println("Indica el titulo del libro que quieras borrar");
        String titulo = sc.nextLine();

        for (Libros libro:libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                libros.remove(libro);
                guardarLibros();
                return;
            }
        }
        System.out.println("Titulo no encontrado");
    }

    public void buscarLibros(){
        System.out.println("Introduce el titulo del libro que quieres buscar");
        String titulo = sc.nextLine();

        for (Libros libro: libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(" El libro buscado es " + titulo + " su autor es: " + libro.getAutor() + " y su año :" + libro.getAnio());
                return;
            }
        }
        System.out.println("Titulo no encontrado");

    }

    public void listarLibros(){
        System.out.println("Lista de libros");
        for (Libros libro: libros){
            System.out.println(libro);
        }
        System.out.println();

    }

    public void actualizarLibros(){
        System.out.println("Indica el titulo del libro que quieras actualizar");
        String titulo = sc.nextLine();

        for (Libros libro: libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Indica el nuevo titulo del libro");
                String tituloNuevo = sc.nextLine();
                libro.setTitulo(tituloNuevo);
                guardarLibros();
                return;


            }
        }
        System.out.println("Titulo no encontrado");

    }

    public void eliminarLibro(){
        System.out.println("Indica el libro que quieras borrar");
        String titulo = sc.nextLine();

        for (Libros libro:libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                libros.remove(libro);
                guardarLibros();
                return;
            }
        }
    }
}
