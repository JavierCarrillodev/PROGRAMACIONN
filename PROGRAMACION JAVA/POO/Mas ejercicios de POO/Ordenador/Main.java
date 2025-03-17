package Ordenador;

public class Main {
    public static void main(String[] args) {

        Ordenador ordenador = new Ordenador(16,50);
        Ordenador ordenador1 = new Ordenador(16,50);
        ordenador.EnciendeOrdenador();
        ordenador.EnciendeOrdenador();
        ordenador.transferirArchivos(10);
        ordenador.eliminarArchivos(15);
        if (ordenador.equals(ordenador1)) {
            System.out.println("Iguales");
        }else {
            System.out.println("Diferentes");
        }




    }
}
