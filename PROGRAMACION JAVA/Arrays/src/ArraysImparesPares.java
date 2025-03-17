import java.util.Scanner;

public class ArraysImparesPares {
    public static void main(String[] args) {

        int[] n, pares, impares;
        int totalPares = 0, totalImpares = 0;
        n = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");
         for (int i = 0; i < n.length; i++){
             n[i] = sc.nextInt();

         }

         for (int i = 0; i < n.length; i++){

            if (n[i]%2 ==0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];
         int j = 0;
         int k = 0;
        for (int i = 0; i < n.length; i++){
            if (n[i] % 2 == 0) {
                pares[j++] = n[i];
            }else{
            impares[k++] = n[i];
        }

        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.println(pares[i] + " ");
        }
        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.println( impares[i] + " ");
        }
        System.out.println();
    }

}
