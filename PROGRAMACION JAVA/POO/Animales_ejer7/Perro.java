package POO.Animales_ejer7;

class Perro extends Animales {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    void hacerSonido() {
        System.out.println("Guaua");

    }
}