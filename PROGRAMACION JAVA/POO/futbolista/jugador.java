package POO.futbolista;

public class jugador {
    public String nombre;
      public  int edad;

    public jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void chutar(){
        System.out.println("Goolllll por la escuadraaaa");
    }
    public void despejar(){
        System.out.println("Despeja el balón");
    }
}
