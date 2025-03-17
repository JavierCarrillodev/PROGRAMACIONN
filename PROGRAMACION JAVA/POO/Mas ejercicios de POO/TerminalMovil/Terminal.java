package TerminalMovil;

public class Terminal {
    private String numero;
    private int tiempoDeConversacion;


    public Terminal(String numero) {
        this.numero = numero;
        this.tiempoDeConversacion = 0;
    }

    public void llamar(Terminal terminal, int segundosLlamada) {
        this.tiempoDeConversacion += segundosLlamada;
        terminal.tiempoDeConversacion += segundosLlamada;
    }
    @Override
    public String toString() {
        return "Nº " + this.numero + " - " + this.tiempoDeConversacion + " s de conversación.";

    }
}
