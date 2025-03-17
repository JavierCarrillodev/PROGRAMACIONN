/*Pedir números hasta que se introduzca uno negativo, y calcular la media.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<Integer>numeros = new ArrayList<>();
        while (true){
            System.out.println("Introduce numeros y si quieres que se cierre el programa introduce un 0");
            int numero = sc.nextInt();

            if (numero < 0){
                System.out.println("Saliendo del programa");
                break;
            }
            numeros.add(numero);
        }
        //Numeros.size() devuelve la cantidad de números que se han ingresado y almacenado en el ArrayList llamado numeros.
        if (numeros.size() > 0){
            double suma = 0;
            /*double num: Esta es la variable temporal que toma el valor de cada elemento
             en la colección numeros durante cada iteración del bucle
             El bucle recorrerá la lista numeros y, en cada vuelta, num será igual al siguiente
             número de la lista.  */
            for (double num : numeros ){
                suma += num;
            }
            double media = suma / numeros.size();
            System.out.println("La media es " + media);
        }else{
            System.out.println("No se han ingresado numeros");
        }

        System.out.println(numeros);



    }
}
