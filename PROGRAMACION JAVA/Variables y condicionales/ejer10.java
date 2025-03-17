//10. Pedir tres números y mostrarlos ordenados de mayor a menor.
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int  num1 = sc.nextInt();
        System.out.println("Introduce otro numero ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el ultimo numero ");
        int num3 = sc.nextInt();

        Integer[] numeros = {num1, num2, num3};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));

    }
}
