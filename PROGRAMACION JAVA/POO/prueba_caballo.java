package POO;

public class prueba_caballo {
    public static void main(String[] args) {
        caballo a = new caballo("pepe","negro", 6, 100);
        caballo b = new caballo("Maria","blanco",5,200);
        a.relincha();
        a.cabalga();
        a.relincha();
        a.tamaño();
    }


}
