/*Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la siguiente tabla.
 Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.img4png*/


public class Ejer1Boletin {
    public static void main(String[] args) {

        int [][] num = {
                {0,30,2,0,0,5},
                {75,0,0,0,0,0},
                {0,0,-2,9,0,11}
        };

        for (int[] n : num){
            for (int elemento: n){
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }




    }
}
