//9. Pedir dos números y mostrarlos ordenados de mayor a menor.
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int num = sc.nextInt();
        System.out.println("Introduce otro numero ");
        int num2 = sc.nextInt();

        Integer[] numeros = {num, num2};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));

    }

}
