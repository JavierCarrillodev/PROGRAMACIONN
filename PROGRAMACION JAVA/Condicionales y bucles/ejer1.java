/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
un número negativo.*/
import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero, y un numero negativo para salir");
            num = sc.nextInt();
            if (num >= 0) {
                int cuadrado = num * num;
                System.out.println("El cuadrado de " + num + " es " + cuadrado);
            }
        }while (num >= 0);
        System.out.println("Has introducido un numero negativo. Saliendo del programa...");

    }
}
