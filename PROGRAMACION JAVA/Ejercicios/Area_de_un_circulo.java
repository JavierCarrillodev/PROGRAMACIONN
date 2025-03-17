import java.util.Scanner;

public class Area_de_un_circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double pi = 3.14;


        System.out.println("Introduce el radio del circulo");
       double r = sc.nextDouble();

        double area = pi* (r*r);
        System.out.println("El area del circulo es: " + area);
    }
}
