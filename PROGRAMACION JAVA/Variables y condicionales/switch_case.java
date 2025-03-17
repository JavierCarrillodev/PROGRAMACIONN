// Se pide al usuario el número de mes programa da el nombre del mes que corresponde a ese numero
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String nombredelmes;
        System.out.println("Ingresa numero de mes ");
        op = sc.nextInt();

        switch (op) {
            case 0:
                nombredelmes = "Enero";
                break;
            case 1:
                nombredelmes = "Febrero";
                break;
            case 2:
                nombredelmes = "Marzo";
                break;
            default:
                nombredelmes = "No existe este mes";

        }
        System.out.println(nombredelmes);



    }
}
