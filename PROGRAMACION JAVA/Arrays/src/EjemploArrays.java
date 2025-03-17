import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {

        String[] productos = new String[4];
        productos[0] = "Ordenador";
        productos[1] = "Móvil Xiaomi";
        productos[2] = "Lavadora";
        productos[3] = "PS5";

        //El .sort ordenará alfabéticamente de la A a la Z
        Arrays.sort(productos);
        System.out.println("Producto[0] = " + productos[0]);
        System.out.println("Producto[1] = " + productos[1]);
        System.out.println("Producto[2] = " + productos[2]);
        System.out.println("Producto[3] = " + productos[3]);


        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }

}
