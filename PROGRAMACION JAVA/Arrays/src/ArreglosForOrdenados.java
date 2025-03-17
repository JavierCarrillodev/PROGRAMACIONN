import java.util.Arrays;

public class ArreglosForOrdenados {
    public static void main(String[] args) {

        String[] productos = {"Lavadora", "Ordenador","Movil xiaomi", "PS5"};

        int total = productos.length;

        int contador = 0;

        for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[i] = auxiliar;

                }
                contador++;
            }

        }
        System.out.println("contador = "+ contador);
    }
}
