package Ejer8;
public class Terminal {
    private int numero;
    private int conversacion;

    public Terminal(int numero) {
        this.numero = numero;
        conversacion = 0;
    }

    public void llama(Terminal terminal, int tiempoLlamada) {
        conversacion += tiempoLlamada;
        terminal.conversacion += tiempoLlamada;

    }

    @Override
    public String toString() {
        return
                "N " + numero + " - " + conversacion + " segundos de conversacion";
    }
}
