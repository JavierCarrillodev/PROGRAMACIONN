public class MainCuentaBancaria {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Jaime",10000);

        System.out.println("Saldo:  " + cuenta.getSaldo());

        cuenta.ingresar(5000);
        System.out.println("Tienes un saldo de: " + cuenta.getSaldo());


        cuenta.retirar(10000);
        System.out.println(cuenta.getSaldo());


    }
}
