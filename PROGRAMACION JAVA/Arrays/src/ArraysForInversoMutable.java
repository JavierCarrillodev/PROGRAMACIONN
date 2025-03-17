import java.util.Arrays;

public class ArraysForInversoMutable {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Lavadora", "Ordenador","Movil xiaomi", "PS5"};

        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        System.out.println("ITERANDO ARRAY CON FOR");
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}
