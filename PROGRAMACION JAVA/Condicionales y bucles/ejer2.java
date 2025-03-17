/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
se introduzca un 0.*/
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if(num > 0){
                System.out.println("El numero " + num + " es positivo");
            }else
                System.out.println("El numero " + num + "  es negativo");
        }while(num != 0);
        System.out.println("Has introducido un 0 saliendo del programa...");
    }
}
