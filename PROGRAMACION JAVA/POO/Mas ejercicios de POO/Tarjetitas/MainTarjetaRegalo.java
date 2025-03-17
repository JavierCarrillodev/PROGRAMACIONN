package Tarjetitas;

public class MainTarjetaRegalo {
    public static void main(String[] args) {

        TarjetaRegalo t1 = new TarjetaRegalo(100,12345);
        System.out.println(t1);
        TarjetaRegalo t2 = new TarjetaRegalo(100,12325);
        TarjetaRegalo t4 = new TarjetaRegalo(1000,11345);
        System.out.println(t4);
        System.out.println(t2);

        TarjetaRegalo t3 = TarjetaRegalo.fusionar(t1, t4);
        System.out.println(t3.toString());

        t3.victoriaGasta(200);
    }
}
