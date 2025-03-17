//14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
import java.util.Scanner;
public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica tu nota ");
        int nota = sc.nextInt();

        if(nota < 5){
            System.out.println("Insuficiente");
        } else if(nota < 6){
            System.out.println("Suficiente");
        } else if(nota <= 8){
            System.out.println("Bien");
        } else {
            System.out.println("Eres un maquina");
        }
    }
}
