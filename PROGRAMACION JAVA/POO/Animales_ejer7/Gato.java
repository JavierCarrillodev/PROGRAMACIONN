package POO.Animales_ejer7;

class Gato extends Animales {
    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    void hacerSonido() {
        System.out.println("Miaia");

    }
}