package Ejer7;

public class Entradas {
    private int entradas;

    public Entradas(int entradas){
        this.entradas = entradas;
    }
    public int getEntradas(){
        return this.entradas;
    }

    public void ventaEntradas(int entradas){
        if (entradas <= this.entradas){
            this.entradas -= entradas;
            System.out.println("Venta realizada con exito");
        }else {
            System.out.println("No se puede realizar la compra, no quedan entradas suficientes");
        }
    }



}
