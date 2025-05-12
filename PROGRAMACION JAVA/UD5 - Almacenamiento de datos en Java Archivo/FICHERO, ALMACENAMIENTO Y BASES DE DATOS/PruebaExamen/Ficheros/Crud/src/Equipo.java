import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
   private int id;
   private String nombre;
   private int titulos;

   public Equipo() {
   }

   public Equipo(int id, String nombre, int titulos) {
      this.id = id;
      this.nombre = nombre;
      this.titulos = titulos;
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

   public int getTitulos() {
      return titulos;
   }

   public void setTitulos(int titulos) {
      this.titulos = titulos;
   }

   @Override
   public String toString() {
      return "Equipo{" +
              "id=" + id +
              ", nombre='" + nombre + '\'' +
              ", titulos=" + titulos +
              '}';
   }

   ArrayList<Equipo> equipos = new ArrayList<>();
   Scanner sc = new Scanner(System.in);
   public  void CrearEquipo(){
      System.out.println("Introduce el id del equipo");
      int id = sc.nextInt();
      sc.nextLine();
      System.out.println("Introduce el nombre del equipo");
      String nombre = sc.nextLine();
      System.out.println("Introduce los titulos del equipo");
      int titulos = sc.nextInt();

      equipos.add(new Equipo(id,nombre,titulos));
   }
   public void leerEquipos(){
      System.out.println("Lista de equipos");
      for (Equipo equipo: equipos){
         System.out.println(equipo);
      }
      System.out.println();
   }
   public void actualizarEquipo(){
      System.out.println("Dime el id del equipo que quieras actualizar");
      int id = sc.nextInt();
      sc.nextLine();
      for (Equipo equipo: equipos){
         if (equipo.getId() == id){
            System.out.println("Dime un nuevo nombre para actualizar");
            String nombreNuevo = sc.nextLine();
            equipo.setNombre(nombreNuevo);
            return;
         }
      }
      System.out.println("La id no se encuentra");
   }

   public void eliminarEquipo(){
      System.out.println("Introduce el id del equipo que quieras borrar");
      int id = sc.nextInt();
      sc.nextLine();

      for (Equipo equipo:equipos){
         if(equipo.getId() == id){
            equipos.remove(equipo);
            System.out.println("Equipo eliminado correctamente");
            return;
         }
      }
      System.out.println("No se encuetra el id");
   }


}
