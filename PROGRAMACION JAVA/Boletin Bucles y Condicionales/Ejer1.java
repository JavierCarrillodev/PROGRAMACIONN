import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
        //un número negativo

       // Bucle while que pedirá números indefinidamente
        while (true){
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();

            if (numero < 0 ){
                System.out.println("Saliendo del programa");
                break;
            }

            int cuadrado = numero * numero;
            System.out.println("El cuadrado del numero " + numero + " es " + cuadrado);

        }
    }
}
