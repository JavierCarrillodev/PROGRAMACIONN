package DispositivosElectronicos;

public class Dispositivos {

    private String nombre;
    private int consumoPorUso;

    public Dispositivos(String nombre, int consumoPorUso) {
        this.nombre = nombre;
        this.consumoPorUso = consumoPorUso;
    }

    public void usarDispositivo() {
        System.out.println("El dispositivo " + nombre + " ha sido utilizado.");
    }

    public String getNombre() {
        return  nombre;
    }
    public int getConsumoPorUso() {
        return consumoPorUso;
    }

    public void setConsumoPorUso(int consumoPorUso) {
        this.consumoPorUso = consumoPorUso;
    }
}
