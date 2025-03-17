import java.util.Scanner;

public class OperadoresTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int max = 0;


        System.out.println("Ingresa un numero: ");
        int num1 = sc.nextInt();

        System.out.println("ingresa el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Ingresa el tercer numero");
        int num3 = sc.nextInt();

        max = (num1 > num2)? num1 : num2;
        max = (max > num3)? max : num3;

        System.out.println("El numero mas grande es : " + max);


    }
}
