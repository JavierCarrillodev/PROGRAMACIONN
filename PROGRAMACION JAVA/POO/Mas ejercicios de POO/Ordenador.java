public class Ordenador {

    private String marca;
    private String modelo;
    private int gbRam = 16;
    private int capacidadDiscoDuro = 50;
    private int capacidaUtilizadaDisco;
    private boolean encendido;

    public Ordenador() {
        this.gbRam = 16;
        this.capacidadDiscoDuro = 50;
        this.capacidaUtilizadaDisco = 0;
        this.encendido = false;

    }

    public Ordenador(int gbRam) throws IllegalArgumentException{
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = 50;
        this.capacidaUtilizadaDisco = 0;
        this.encendido = false;
    }
    public Ordenador( int gbRam, int capacidadDiscoDuro) {
        setGbRam(gbRam);
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.capacidaUtilizadaDisco = 0;
        this.encendido = false;

    }
    public Ordenador(String marca, String modelo, int gbRam, int capacidadDiscoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        setGbRam(gbRam);
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.capacidaUtilizadaDisco = 0;
        this.encendido = false;
    }

    private void setgRam(int gbRam) throws IllegalArgumentException {
        if ((gbRam  & (gbRam -1)) != 0){
            throw new IllegalArgumentException("La ram debe ser una potencia de dos");
        }
        this.gbRam = gbRam;

    }
    public void encender(){
        encendido = true;
        System.out.println("Encendido con exito");
    }
    public void apagar(){
        encendido = false;
        System.out.println("Apagado con exito");
    }

    public void transferirArchivos(int numeroGb){
        if(encendido){
            capacidaUtilizadaDisco += numeroGb;
            System.out.println("Se estan utilizando " + capacidaUtilizadaDisco + " GB ");
            if (numeroGb > capacidadDiscoDuro){
                System.out.println("Capacidad insuficiente");

            }

        }

    }

    public void eliminarArchivos(int numeroGbEliminado) {
        if(encendido){
            capacidaUtilizadaDisco -= numeroGbEliminado;
            System.out.println("Capacidad de disco duro utilizado despues de eliminar " + numeroGbEliminado + " GB " + "es de: " +  capacidaUtilizadaDisco + " GB ");
            if (numeroGbEliminado > capacidaUtilizadaDisco){
                capacidaUtilizadaDisco = 0;

        }
        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getCapacidaUtilizadaDisco() {
        return capacidaUtilizadaDisco;
    }

    public void setCapacidaUtilizadaDisco(int capacidaUtilizadaDisco) {
        this.capacidaUtilizadaDisco = capacidaUtilizadaDisco;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public boolean equals(Object obj) {
        Ordenador a = (Ordenador) obj;
        return (this.marca.equals(a.getMarca()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", gbRam=" + gbRam +
                ", capacidadDiscoDuro=" + capacidadDiscoDuro +
                ", capacidaUtilizadaDisco=" + capacidaUtilizadaDisco +
                ", encendido=" + encendido +
                '}';
    }
}



