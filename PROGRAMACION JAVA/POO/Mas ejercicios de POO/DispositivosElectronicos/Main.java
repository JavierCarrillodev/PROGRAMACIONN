package DispositivosElectronicos;

public class Main {
    public static void main(String[] args) {

        DispositivoConBateria dispositivoConBateria1 = new DispositivoConBateria("Movil",20);
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.modoUltraAhorro(false);
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.modoUltraAhorro(true);
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.modoUltraAhorro(false);
        dispositivoConBateria1.usarDispositivo();
        Portatil Lenovo = new Portatil("Lenovo",20,10,100);
        Lenovo.usarDispositivo();
        Lenovo.usarDispositivo();



    }
}
