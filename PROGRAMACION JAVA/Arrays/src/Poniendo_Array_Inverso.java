import java.util.Arrays;

public class Poniendo_Array_Inverso {
    public static void main(String[] args) {

        String[] productos = new String[4];
        int total = productos.length;

        productos[0] = "Ordenador";
        productos[1] = "Móvil Xiaomi";
        productos[2] = "Lavadora";
        productos[3] = "PS5";

        Arrays.sort(productos);

        //Lo que hacemos con el for es iterar el array
        System.out.println("ITERANDO ARRAY CON FOR");
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println(" ");

        System.out.println("====Usando for inverso====");
        for (int i = total -1; i >= 0; i--){
            System.out.println("Para i = " + i + " valor: " + productos[i]);
        }

    }
}
