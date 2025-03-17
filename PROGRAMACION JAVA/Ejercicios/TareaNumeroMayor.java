import java.util.Scanner;

public class TareaNumeroMayor {
    public static void main(String[] args) {
    /*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        Podría ser utilizando operador ternario.*/
        Scanner sc = new Scanner(System.in);

        int max1 = 0;
        int max2 = 0;


        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();

        max1 = (num1 > num2)? num1 : num2;
        max2 = (num1 < num2)? num1 : num2;

        /*Esta es otra forma de indicar de que me diga
        cual es el mayor y el menor*/

        /*max1 = Math.max(num1, num2);
        max2 = Math.min(num1 , num2);*/
        System.out.println("El numero mayor es " + max1 + " y despues " + max2);

    }
}
