import java.util.Scanner;
/* Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
/se introduzca un 0.*/
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        while (true) {
            System.out.println("Di un numero");
            int numero = sc.nextInt();

            if (numero > 0){
                System.out.println("El numero es positivo");
            }if(numero < 0) {
                System.out.println("El numero es negativo");
            }else if(numero == 0){
                System.out.println("Saliendo del programa");
                break;
            }


        }






    }



}
