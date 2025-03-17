import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite un numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El "+ numero + "es par");
            }else{
                System.out.println("No te voy a monstrar numero impares");
            }

        }while ( numero % 2 == 0);
    }
}
