public class CuentaBancaria {
    // Atributos privados, solo accesibles desde dentro de la clase
    private String titular;
    private double saldo;

    // Constructor público para inicializar los atributos
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método público que permite consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método público para realizar depósitos en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Método protegido para mostrar los datos del titular
    // Solo accesible desde clases en el mismo paquete o subclases
    protected void mostrarTitular() {
        System.out.println("Titular de la cuenta: " + titular);
    }

    // Método privado para calcular los intereses anuales
    // Solo accesible dentro de esta clase
    private double calcularInteresAnual() {
        final double TASA_INTERES = 0.03; // Tasa de interés del 3%
        return saldo * TASA_INTERES;
    }

    // Método público que muestra el interés anual usando el método privado
    public void mostrarInteresAnual() {
        double interes = calcularInteresAnual();
        System.out.println("Interés anual estimado: " + interes);
    }
}

