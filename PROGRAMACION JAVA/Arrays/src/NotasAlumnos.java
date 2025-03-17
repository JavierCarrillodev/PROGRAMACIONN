import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLengua;
        int sumNotasMatematicas = 0,sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new  double[7];
        claseHistoria = new  double[7];
        claseLengua = new  double[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 7 notas de estudiantes para matematicas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = sc.nextDouble();
        }
        System.out.println("Ingresa 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = sc.nextDouble();
        }
        System.out.println("Ingresa 7 notas de estudiantes para Lengua");
        for (int i = 0; i < claseLengua.length; i++){
            claseLengua[i] = sc.nextDouble();
        }
        for (int i = 0; i < claseLengua.length; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLengua[i];
        }
        double promedioMatematicas = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria= (sumNotasHistoria/claseHistoria.length);
        double promedioLengua = (sumNotasLenguaje/claseLengua.length);
        System.out.println("Promedio clase matematicas " + promedioMatematicas);
        System.out.println("Promedio clase Historia " + promedioHistoria);
        System.out.println("Promedio clase Lengua " + promedioLengua);
        System.out.println("Promedio total del curso " + (promedioMatematicas + promedioHistoria + promedioLengua)/3);

        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = sc.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLengua[id] + claseMatematicas[id]/3);
        System.out.println("Promedio alumnos = " + promedioAlumno);










        }
}