public class CuentaBancaria {
    private String titular;
    private int saldo;

    public CuentaBancaria(String titular, int saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void ingresar(int cantidad) {
        this.saldo += cantidad;
        if (cantidad > this.saldo) {
            System.out.println("Buen dinerito metiste");
        }
    }
    public void retirar(int cantidad) {
        this.saldo -= cantidad;
        if (cantidad > this.saldo) {
            System.out.println("Fondos insuficiente");
        }
    }
}
