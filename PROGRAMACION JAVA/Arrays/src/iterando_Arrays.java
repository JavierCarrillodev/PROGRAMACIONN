import java.util.Arrays;

public class iterando_Arrays {
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
        System.out.println("================================================");

        //Aquí lo iteramos con el foreach
        System.out.println("ITERANDO ARRAY CON FOREACH");
        for (String prod: productos){
            System.out.println("Prod = " + prod);

        }

        System.out.println("================================================");
    //Aquí lo iteramos con el while
        System.out.println("ITERANDO ARRAY CON WHILE");
        int i = 0;
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;


        }
        System.out.println("================================================");
        //Aquí lo iteramos con el do while
        System.out.println("ITERANDO ARRAY CON DO WHILE");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;

        }while (j < total);



    }
}
