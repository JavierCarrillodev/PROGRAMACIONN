/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar*/
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if (num % 2 == 0){
                System.out.println("El numero " + num + " es par");
            }else
                System.out.println("El numero " + num + " es impar");
        }while(num !=0);
        System.out.println("Has introducido un 0 saliendo del programa...");
    }
}
