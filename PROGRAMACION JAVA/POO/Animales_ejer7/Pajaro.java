package POO.Animales_ejer7;

class Pajaro extends Animales {
    public Pajaro(String nombre) {
        super(nombre);
    }
    @Override
    void hacerSonido() {
        System.out.println("piioioi");

    }
}