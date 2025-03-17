package vehiculos;

public class cocheDeportivo extends Vehiculo {
    private boolean descapotable = true;

    public cocheDeportivo(String marca, String modelo, boolean descapotable) {
        super(marca, modelo);
        this.descapotable = descapotable;
    }

    public void EsOnodescapotable(){
        if(descapotable){
            System.out.println("Es descapotable");
        }if(descapotable ==false) {
            System.out.println("No es descapotable");
        }
    }

    @Override
    public String toString() {
        return "cocheDeportivo{" +
                "descapotable=" + descapotable +
                '}';
    }
}
