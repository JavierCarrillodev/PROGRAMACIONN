package Ordenador;

import java.util.Objects;

public class Ordenador {
    private String Marca;
    private String Modelo;
    private int GBRam;
    private int CapacidadDiscoDuro = 50;
    private int EspacioUtilizadoDisco;
    private boolean encendido = false;

    public Ordenador() {
        this("","",4,50);
    }

    public Ordenador(int GBRam) {
        this ("","",GBRam,50);
    }

    public Ordenador(int GBRam, int capacidadDiscoDuro) {
        this ("","",GBRam,capacidadDiscoDuro);
    }

    public Ordenador(String marca, String modelo, int GBRam, int capacidadDiscoDuro) {
        Marca = marca;
        Modelo = modelo;
        this.GBRam = GBRam;
        CapacidadDiscoDuro = capacidadDiscoDuro;
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getGBRam() {
        return GBRam;
    }

    public void setGBRam(int GBRam) {
        this.GBRam = GBRam;
    }

    public int getCapacidadDiscoDuro() {
        return CapacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        CapacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getEspacioUtilizadoDisco() {
        return EspacioUtilizadoDisco;
    }

    public void setEspacioUtilizadoDisco(int espacioUtilizadoDisco) {
        EspacioUtilizadoDisco = espacioUtilizadoDisco;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }



    private boolean esPotenciaDe2(int numero) {
        if (numero <= 0) {
            return false;
        }
        double logBase2 = Math.log(numero) / Math.log(2);
        return logBase2 ==(int) logBase2;
    }

    public void EnciendeOrdenador(){
        if (encendido){
            System.out.println("Ya esta encendido");
        } else
            encendido = true; {
            System.out.println("Encendiendo");
        }
    }
    public void ApagarOrdenador(){
           if (!encendido){
               System.out.println("Ya esta apagado");
           }else {
               encendido = false;
               System.out.println("Apagando...");
           }
    }

    public void transferirArchivos(int gb){
        if(encendido){

          if (EspacioUtilizadoDisco + gb <= CapacidadDiscoDuro){
             EspacioUtilizadoDisco += gb;
              System.out.println("Transferido " + gb + "GB" + " de " + EspacioUtilizadoDisco + "GB");
          }else {
              System.out.println("Espacio insuficiente");
          }

        }
    }

    public void eliminarArchivos(int gb){
        if(encendido){

            if (EspacioUtilizadoDisco - gb < 0){
              EspacioUtilizadoDisco = 0;
                System.out.println("Se ha eliminado " + gb + "GB" + " estas utilizando " + EspacioUtilizadoDisco + "GB ");
          }else {
                EspacioUtilizadoDisco -= gb;
            }
            System.out.println("Se ha eliminado " + gb + "GB " + "quedan " + EspacioUtilizadoDisco + "GB " ) ;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ordenador ordenador = (Ordenador) o;
        return Objects.equals(Marca, ordenador.Marca) && Objects.equals(Modelo, ordenador.Modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Marca, Modelo);
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", GBRam=" + GBRam +
                ", CapacidadDiscoDuro=" + CapacidadDiscoDuro +
                ", EspacioUtilizadoDisco=" + EspacioUtilizadoDisco +
                ", encendido=" + encendido +
                '}';
    }
}
