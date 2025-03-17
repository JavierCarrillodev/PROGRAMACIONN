import java.util.Scanner;

public class operadores_ternarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*En este caso el signo de ? representa un if y
         los dos puntos (:) como si fuese el else*/
        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variables = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matematicas:");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencias:");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota de historia:");
        historia = sc.nextDouble();

        //Hacemos la media de las tres asignatura
        promedio = (matematicas + ciencias + historia )/3;
        System.out.println("Promedio: " + promedio);

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);

        //Otra forma de hacerlo es la siguiente:
       /* if (promedio >= 5.49){
            estado = "Aprobado";
        }else {
            estado = "Rechazado";

        }*/

    }
}
