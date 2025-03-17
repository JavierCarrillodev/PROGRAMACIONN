/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se ha
introducido.*/
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int contador = 0;

        do{
            System.out.println("Introduce numeros, y si quieres parar introduce un numero negativo");
            n = sc.nextInt();
            contador++;
        }while(n >= 0);
        System.out.println("Has introducido un numero negativo, saliendo del programa...");
        System.out.println("Has introducido " + contador+ " numeros");

    }
}
