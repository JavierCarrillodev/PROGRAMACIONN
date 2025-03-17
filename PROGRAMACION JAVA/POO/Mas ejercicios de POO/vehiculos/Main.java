package vehiculos;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("ford","focus");
        System.out.println(vehiculo.toString());

        coche coche1 = new coche("nissan","urus",4);
        System.out.println(coche1.toString());
        moto moto1 = new moto("Suzuki","650",true);
        System.out.println(moto1.toString());
        moto1.sidecar();

        cocheDeportivo cochecito = new cocheDeportivo("Lambo","Huracan",true);
        cochecito.EsOnodescapotable();
    }
}
