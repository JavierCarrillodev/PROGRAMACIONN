package POO.Animales_ejer7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animales> animales = new ArrayList<>();
        Perro perro1= new Perro("Perro1");
        Gato gato1= new Gato("Gato1");
        Pajaro pajaro1= new Pajaro("Pajaro1");
        animales.add(perro1);
        animales.add(gato1);
        animales.add(pajaro1);

        for (Animales a : animales) {
            a.hacerSonido();
        }
    }
}
