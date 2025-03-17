package Enum;

public enum Ejemplo_Enum {
    ENERO(31),
    FEBRERO (28),
    MARZO(31),
    ABRIL(30),
    MAYO(31),
    JUNIO(30),
    JULIO(31),
    AGOSTO(30),
    SEPTIEMBRE(30),
    OCTUBRE(31),
    NOVIEMBRE(30),
    DICIEMBRE(31);

   private int dias;

    private Ejemplo_Enum (int dias){
        this.dias = dias;
    }
    public int getDias() {
        return dias;
    }

}
