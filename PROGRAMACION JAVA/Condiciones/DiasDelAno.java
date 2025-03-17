import java.util.Scanner;

public class DiasDelAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica un mes del 1 - 12");
        int mes = sc.nextInt();

        int numeroDias = 0;

        System.out.println("Indica un año (YYYY)");
        int anio = sc.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }
        System.out.println(numeroDias);

        /*
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
            numeroDias = 30;
        } else if (mes == 2) {
            numeroDias = 29;
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
            } else {
                numeroDias = 28;
            }
        }       System.out.println("Numeros de dias: " + numeroDias);*/

    }
}