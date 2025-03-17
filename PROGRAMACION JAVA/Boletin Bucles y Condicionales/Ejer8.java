//Pedir un número N, y mostrar todos los números del 1 al N.
import javax.swing.*;
import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n = sc.nextInt();
        //Se va incrementando hasta llegar a n
            for (int i = 1; i <= n; i++ ){
                System.out.println(i + " ");
            }





    }
}
