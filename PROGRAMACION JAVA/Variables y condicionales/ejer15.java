//15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días
import java.util.Scanner;
public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia");
        int dia = sc.nextInt();
        System.out.println("Dime un mes");
        int mes = sc.nextInt();
        System.out.println("Dime un ano");
       int ano = sc.nextInt();

       if (dia > 30)
           System.out.println("ERROR, TODOS LOS MESES DEBE TENER 30 DÍAS");
       else if (mes < 1 || mes > 12) {
           System.out.println("ERROR LOS MESES DEBEN DE ESTAR ENTRE 1 Y 12");
       }else if (ano < 0) {
           System.out.println("ERROR NO SE ADMITEN AÑOS ANTES DE CRISTO");

       }else {
           System.out.println("FECHA INTRODUCIDA CORRECTA");
       }
    }
}
