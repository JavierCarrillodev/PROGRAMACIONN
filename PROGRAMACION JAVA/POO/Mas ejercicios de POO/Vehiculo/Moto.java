package Vehiculo;

public class Moto extends Vehiculo {
    private boolean sidecar;


    public Moto(String marca, String modelo, boolean sidecar) {
        super(marca, modelo);
        this.sidecar = sidecar;
    }

    public void sidecar(){
        if (sidecar){
            System.out.println("Esta moto tiene sidecar");
        }else {
            System.out.println("Esta moto no tiene sidecar");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Sidecar = " + sidecar;
    }
}
