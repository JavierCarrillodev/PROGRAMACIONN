import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    private int id;
    private String nombre;
    private String marca;

    public Coches() {
    }

    public Coches(int id, String nombre, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    ArrayList<Coches> coches = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void crearCoche(){
        System.out.println("Indica el id del coche para crear");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Indica el nombre del coche para crear");
        String nombre = sc.nextLine();

        System.out.println("Indica la marca del coche para crear");
        String marca = sc.nextLine();

        coches.add((new Coches(id,nombre,marca)));
    }

    public void leerCoches(){
        System.out.println("Lista de coches");
        for (Coches coche: coches){
            System.out.println(coche);
        }
        System.out.println();
    }

    public void actualizaCoches(){
        System.out.println("Indica el id del coche para actualizar");
        int id = sc.nextInt();
        sc.nextLine();
        for (Coches coche: coches){
            if (coche.getId() == id){
                System.out.println("Indica el nuevo nombre");
                String nuevoNombre = sc.nextLine();
                coche.setNombre(nuevoNombre);
                System.out.println("Nombre cambiado correctamente");
                return;

            }
        }
        System.out.println("La id no se encuentra");
    }
    public void eliminarCoche() {
        System.out.println("Indica el id del coche para eliminar");
        int id = sc.nextInt();
        sc.nextLine();
        for (Coches coche:coches){
            if (coche.getId() == id){
                coches.remove(coche);
                System.out.println("Coche eliminado correctamente");
                return;
            }
        }
        System.out.println("La id no se encuentra");
    }


    }
