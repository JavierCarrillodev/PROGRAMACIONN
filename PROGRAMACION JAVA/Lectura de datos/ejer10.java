//Ejercicio 10. Realiza un conversor de Kb a Mb.
import java.util.Scanner;
public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuanto Kb quieres pasar a Mb");
        double Kb = sc.nextDouble();

        double Mb = Kb / 1024;

        System.out.println(Mb + " MB");


    }
}
