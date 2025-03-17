package Aeropuerto;

public class Main {
    public static void main(String[] args) {

        AeropuertoPublico ap = new AeropuertoPublico("Madrid",2000,2000,100000,10);
        AeropuertoPrivado apr = new AeropuertoPrivado("Madrid",2000,2000,10);

        System.out.println(ap);
        System.out.println(apr);

        ap.gananciasTotales(20000);
        apr.gananciasTotales(20000);
        apr.gananciasTotales(2000);
    }
}
