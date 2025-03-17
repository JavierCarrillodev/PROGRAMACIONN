package Ejer9;

public class Movil extends Terminal {
    private String tipo;
    private double tarificacion;

    public Movil(int numero ,String tipo){
        super(numero);
        this.tipo = tipo;
        this.conversacion = 0;

    }

    public void llamada(Terminal terminal, int segundosLLamada){

        super.llama(terminal, segundosLLamada);

        conversacion += segundosLLamada;
        terminal.conversacion += segundosLLamada;

        double minutos = (double) segundosLLamada / 60;

        if (this.tipo == "rata"){
            this.tarificacion += minutos * 0.06;
        }
        if (this.tipo == "mono") {
            this.tarificacion += minutos * 0.12;
        }
        if (this.tipo == "bisonte") {
            this.tarificacion += minutos * 0.30;
        }


    }

    @Override
    public String toString() {
        return "Nº: "+ numero + " - " +this.conversacion+" segundos de conversación - tarificados: "+this.tarificacion+" euros.";
    }
}