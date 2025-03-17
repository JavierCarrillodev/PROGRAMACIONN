import java.util.Scanner;
public class ejer11_diferente_forma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 0 al 999 ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Tiene una cifra");
        }else if (n <= 99) {
            System.out.println("Tiene dos cifra");
        }else if (n < 1000) {
            System.out.println("Tiene tres cifra");
        }


    }
}
