package POO.Animales_ejer7;

abstract class  Animales {
    public String nombre;
    Animales(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this. nombre;
    }
    abstract void hacerSonido();

}
