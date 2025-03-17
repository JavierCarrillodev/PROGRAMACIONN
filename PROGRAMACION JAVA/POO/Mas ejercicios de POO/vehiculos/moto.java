package vehiculos;

public class moto extends Vehiculo {
  private boolean sidecar = true;

    public moto(String marca, String modelo, boolean sidecar) {
        super(marca, modelo);
        this.sidecar = sidecar;
    }
    public void sidecar() {
        if (sidecar) {
            System.out.println("Esta moto tiene sidecar");
        }if (sidecar == false) {
            System.out.println("Esta moto no tiene sidecar");
        }
    }

    @Override
    public String toString() {
        return "moto{" +
                "sidecar=" + sidecar +
                '}';
    }
}
