import java.util.Scanner;
public class leer_5_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num,max,contador;
      boolean negativo;
      contador = 0;
      max = 0;
      negativo = false;
        System.out.println("Dime 5 numeros");
      while (contador < 5) {
          num = sc.nextInt();
          if (num < 0) {
              negativo = true;
          }if (num > max);
          max = num;
          contador++;
      }if (negativo == true) {
            System.out.println("Algun numero ha sido negativo");
        }else{
          System.out.println("No hay números negativos");
        }
        System.out.println("Numero maximo es: " + max);

    }
}
