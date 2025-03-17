package Vehiculo;

public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto("Susuki","650",true);
        moto.sidecar();
        CocheDeportivo cocheDeportivo = new CocheDeportivo("Ford","123",4,true);
        cocheDeportivo.descapotable();
    }
}
