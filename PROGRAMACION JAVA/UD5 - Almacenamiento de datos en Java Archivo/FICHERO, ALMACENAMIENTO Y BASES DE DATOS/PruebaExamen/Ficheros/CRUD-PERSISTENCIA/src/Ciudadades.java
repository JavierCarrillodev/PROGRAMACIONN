import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Scanner;

public class Ciudadades {
    private int codigoPostal;
    private String  ciudad;
    private String tamano;

    public Ciudadades() {
    }

    public Ciudadades(int codigoPostal, String ciudad, String tamano) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.tamano = tamano;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }

    private ArrayList<Ciudadades>ciudadades = new ArrayList<>();
    private String archivo = "CRUD-PERSISTENCIA/ciudad.json";
    private ObjectMapper mapper = new ObjectMapper();
    private Scanner sc = new Scanner(System.in);

    public void cargarCiudad(){
        File file = new File(archivo);
        if (file.exists()){
            try {
             ciudadades = mapper.readValue(file, new TypeReference<ArrayList<Ciudadades>>() {
             });
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }

    }

    public void guardarCiudad(){
        try{
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(archivo),ciudadades);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void crearCiudad(){
        System.out.println("Indica el codigo postal de la ciudad que quieras crear");
        int codigoPostal = sc.nextInt();
        sc.nextLine();

        System.out.println("Indica el nombre de la ciudad que quieras crear");
        String ciudad = sc.nextLine();

        System.out.println("Indica el tamno de la ciudad que quieras crear");
        String tamano = sc.nextLine();

        ciudadades.add(new Ciudadades(codigoPostal,ciudad,tamano));
        guardarCiudad();


    }

    public void listarCiudades(){
        System.out.println("Lista de Ciudades");
        for (Ciudadades ciudadades:ciudadades){
            System.out.println(ciudadades);
        }
        System.out.println();
    }

    public void buscarCiudad(){
        System.out.println("Indica el nombre de la ciudad que quieres ver");
        String ciudad = sc.nextLine();

        for (Ciudadades ciudadades:ciudadades){
            if (ciudadades.getCiudad().equalsIgnoreCase(ciudad)){
                System.out.println("La ciudad que buscada tiene codigo postal " + ciudadades.getCodigoPostal() + " su nombre es: " + ciudadades.getCiudad() + " y su tamano es " + ciudadades.getTamano());
                return;
            }
        }
        System.out.println("Id no encontrada");

    }

    public void actualiazarCiudades(){
        System.out.println("Indica el codigo postal de la ciudad que quieras cambiar");
        int codigoPostal = sc.nextInt();
        sc.nextLine();

        for (Ciudadades ciudadades:ciudadades){
            if (ciudadades.getCodigoPostal() == codigoPostal){
                System.out.println("Introduce el nuevo nombre de la ciudad");
                String ciudadNueva = sc.nextLine();
                ciudadades.setCiudad(ciudadNueva);
                guardarCiudad();
                return;
            }
        }
        System.out.println("Id no encontrada");
    }
    public void eliminarCiudad(){
        System.out.println("Indica el codigo postal de la ciudad que quieres eliminar");
        int codigoPostal = sc.nextInt();
        sc.nextLine();

        for (Ciudadades ciudad:ciudadades){
            if (ciudad.getCodigoPostal() == codigoPostal){
                ciudadades.remove(ciudad);
                guardarCiudad();
                return;
            }
        }
        System.out.println("Id no encontrada");

    }

}
