//Ejercicio 9. Realiza un conversor de Mb a Kb.
import java.util.Scanner;
public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuanto Mb quieres pasar");
        double Mb = sc.nextDouble();

        double kb = Mb * 1024;

        System.out.println(kb);


    }
}
