//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
//introducido
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        while (true){
            System.out.println("Introduce un numero");
           int numero = sc.nextInt();


            if (numero == 0){
                System.out.println("Saliendo del programa");
                break;

            }
            //Suma toda los numeros introducido
            suma += numero;

        }
        System.out.println("La suma total es " + suma);
    }
}
