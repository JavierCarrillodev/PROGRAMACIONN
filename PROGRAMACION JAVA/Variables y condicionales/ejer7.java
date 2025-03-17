//7. Pedir dos números y decir cual es el mayor.
// 8. Pedir dos números y decir cual es el mayor o si son iguales.
import java.util.Scanner;
public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("Son el mismo numero");
        }else if(num > num2)
            System.out.println("El primero numero es mayor que el segundo numero");
        else {
            System.out.println("El segundo numero es mayor que el primer numero");

        }
    }
}

