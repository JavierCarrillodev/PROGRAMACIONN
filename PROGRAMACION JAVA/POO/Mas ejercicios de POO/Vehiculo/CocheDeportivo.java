package Vehiculo;

public class CocheDeportivo extends Coche {

    private boolean descapotable;

    public CocheDeportivo(String marca, String modelo, int numeroDePuertas, boolean descapotable) {
        super(marca, modelo, numeroDePuertas);
        this.descapotable = descapotable;
    }

    public void descapotable(){
        if (descapotable){
            System.out.println("Este cohe es descapotable");
        }else {
            System.out.println("Este cohe no es descapotable");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "descapotable = " + descapotable;
    }
}
