//18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).
//17. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. Suponer que todos los meses tienen 30 días.
import java.util.Scanner;
public class ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dia");
        int dia = sc.nextInt();
        System.out.println("Ingresa un mes");
        int mes = sc.nextInt();
        System.out.println("Ingresa una ano");
        int ano = sc.nextInt();

        dia++;

        if (dia >30){
            System.out.println("ERROR EL DIA NO PUEDE SER MAYOR QUE 30");
            dia = 1;
            mes++;
        } else if (mes > 12) {
            System.out.println("ERROR EL MES NO PUEDE SER MAYOR QUE 12");
            mes = 1;
            ano++;
        }else if (ano < 0){
            System.out.println("ERROR EL ANO NO PUEDE SER MENOR QUE 0");
            ano = 1;
        }else
            System.out.printf("La fecha del día siguiente es: %02d/%02d/%d%n", dia, mes, ano);
    }
}
