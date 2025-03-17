package Tarjetitas;

import java.util.Objects;
import java.util.Random;

public class TarjetaRegalo {

    private int saldo;
    private int numero;

    public TarjetaRegalo(int saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void victoriaGasta(int DineroGastado){
        if(DineroGastado > this.saldo ){
            System.out.println("Error dinero insuficiente, te has intentado gastar " + DineroGastado + " Y tienes disponible " + saldo + " deja de robar a javi");
        }else {
            this.saldo -= DineroGastado;
            System.out.println("Se ha gastado " + DineroGastado +" de tu dinero javi, lo siento." + " Te queda disponible " + saldo +"€" + " deja de robar a javi"
            );
        }
    }
    public static TarjetaRegalo fusionar(TarjetaRegalo t1, TarjetaRegalo t2) {
        // Sumar los saldos de las dos tarjetas
        int saldoFusionado = t1.getSaldo() + t2.getSaldo();

        // Generar un nuevo número aleatorio de 5 cifras
        Random rand = new Random();
        int numeroFusionado = rand.nextInt(90000) + 10000; // Genera un número aleatorio entre 10000 y 99999

        // Crear la nueva tarjeta con el saldo fusionado y el nuevo número
        TarjetaRegalo tarjetaFusionada = new TarjetaRegalo(saldoFusionado, numeroFusionado);

        // Dejar las tarjetas originales con saldo 0
        t1.saldo = 0;
        t2.saldo = 0;

        // Retornar la nueva tarjeta
        return tarjetaFusionada;

    }

    @Override
    public String toString() {
        return "Tarjeta" +
                " numero: " + numero +
                ", saldo: " + saldo;
    }
}
