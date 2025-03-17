import java.util.Scanner;

public class sancho_explotacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado hoy?");
        int horas = sc.nextInt();

        double salario = 5 * horas;

        double estafa = horas / salario;
        System.out.println("El salario es " + salario);


    }
}