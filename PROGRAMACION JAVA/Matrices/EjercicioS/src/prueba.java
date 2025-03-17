import java.util.Scanner;

public class prueba {
    public static void Pintar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la altura de la tableta");
        int altura = sc.nextInt();

        System.out.println("Ingresa la anchura de la tableta");
        int anchura = sc.nextInt();

        for (int i = 0; i < altura; i++){
            for (int j = 0; j < anchura; j++){

                boolean estaEnBorde = (i == 0) || (i == altura -1) || (j == 0) || (j == anchura -1);

                if (estaEnBorde){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        Pintar();
    }
}