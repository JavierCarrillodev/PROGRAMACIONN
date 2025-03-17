package DispositivosElectronicos;

public class Portatil extends Dispositivos {
    private int ahorroBateria ;
    private int bateria = 100;

    public Portatil(String nombre, int consumoPorUso, int ahorroBateria, int bateria) {
        super(nombre, consumoPorUso);
        this.ahorroBateria = ahorroBateria;
        this.bateria = bateria;
    }

    public int getAhorroBateria() {
        return ahorroBateria;
    }
    public void setAhorroBateria(int ahorroBateria) {
        this.ahorroBateria = ahorroBateria;
    }

    @Override
    public void usarDispositivo() {
        if (bateria > 0) {
            bateria -= ahorroBateria;
            System.out.println("Dispositivo " + getNombre() + " ha sido utilizado. Bateria restante " + bateria + "%");
        }if (bateria == 0){
            System.out.println("Dispositivo " + getNombre() + " se ha quedado sin bateria");
        }
    }
    @Override
    public String toString() {
        return "Portatil{" +
                "ahorroBateria=" + ahorroBateria +
                ", bateria=" + bateria +
                '}';
    }
}
