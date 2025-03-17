package POO.futbolista;

public class Main {
    public static void main(String[] args) {
        jugador jugador1 = new jugador("Cristiano", 39);
        System.out.println("El jugador llamado: " + jugador1.nombre + " tiene " + jugador1.edad + " años va a chutar y...");
        jugador1.chutar();
        jugador jugador2 = new jugador("Juan", 39);
        System.out.println("El jugador llamado: " + jugador2.nombre + " tiene " + jugador2.edad + " años va detras del balón y...");
        jugador2.despejar();
    }
}
