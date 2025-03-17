package TerminalMovil;

public class Movil extends Terminal {

    private String tarifa;
    private double costePorMinutos;
    private int tarificacion;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.tarificacion = 0;
        comprobarTarifa(tarifa);
    }
    public void comprobarTarifa(String tarifa) {
        if(tarifa.equals("rata")) {
            this.costePorMinutos = 0.06;
        }else if(tarifa.equals("mono")) {
            this.costePorMinutos = 0.12;
        }else if(tarifa.equals("bisonte")) {
            this.costePorMinutos = 0.30;
        }else{
            System.out.println("Tarifa incorrecta");
        }
    }

    @Override
    public void llamar(Terminal terminal, int segundosLlamada) {
        super.llamar(terminal, segundosLlamada);
        double minutoLlamada = (double) segundosLlamada / 60;

        this.tarificacion += minutoLlamada * costePorMinutos;
    }

    @Override
    public String toString() {
        return super.toString() + "Tarificados: " + tarificacion + " euros";
    }
}
