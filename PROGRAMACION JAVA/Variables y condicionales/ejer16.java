//16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos
import java.util.Scanner;
public class ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dia");
        int dia = sc.nextInt();
        System.out.println("Ingresa un mes");
        int mes = sc.nextInt();
        System.out.println("Ingresa una ano");
        int ano = sc.nextInt();

        if (dia == 29)
            System.out.println("ERROR EL DIA NO PUEDE SER 29");
        else if (dia >31){
            System.out.println("ERROR EL DIA NO PUEDE SER MAYOR QUE 30");
        } else if (mes > 12) {
            System.out.println("ERROR EL MES NO PUEDE SER MAYOR QUE 12");
        }else if (ano < 0){
            System.out.println("ERROR EL ANO NO PUEDE SER MENOR QUE 0");

        }else
            System.out.println("FECHA INTRODUCIDA CORRECTA");
    }
}
