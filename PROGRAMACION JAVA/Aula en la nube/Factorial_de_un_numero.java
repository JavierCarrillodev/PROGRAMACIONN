import java.util.Scanner;
public class Factorial_de_un_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete un número");
        int n = sc.nextInt();
        int fact = 1;
        int contador = n;
        while (contador >= 1) {
            fact = fact * contador;
            contador--;
        }

        System.out.println("El factorial de " + n + " es " + fact);
    }
}
