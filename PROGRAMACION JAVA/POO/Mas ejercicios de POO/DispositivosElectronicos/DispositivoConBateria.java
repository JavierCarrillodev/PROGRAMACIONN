package DispositivosElectronicos;

public class DispositivoConBateria extends Dispositivos {
    private int bateria = 100;

    public DispositivoConBateria(String nombre, int consumoPorUso) {
        super(nombre, consumoPorUso);
        this.bateria = 100;
    }

    @Override
    public void usarDispositivo() {
        if (bateria > 0) {
            bateria -= getConsumoPorUso();
            System.out.println("Dispositivo " + getNombre() + " ha sido utilizado. Bateria restante " + bateria + "%");
        }if (bateria == 0){
            System.out.println("Dispositivo " + getNombre() + " se ha quedado sin bateria");
        }
    }
    public void recargar() {
        bateria = 100;
        System.out.println("Dispositivo " + getNombre() + " ha sido recargado al 100%");

    }

    public void modoUltraAhorro(boolean modoUltraAhorro) {
    if (!modoUltraAhorro) {
        setConsumoPorUso(10);
        System.out.println("EL ahorro de bateria activado");

    }else {
        setConsumoPorUso(20);
        System.out.println("Ahorro de bateria desactivado");
    }
    }
}
