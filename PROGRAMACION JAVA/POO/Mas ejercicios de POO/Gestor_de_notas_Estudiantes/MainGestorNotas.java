package Gestor_de_notas_Estudiantes;

import java.util.Scanner;

public class MainGestorNotas {
    public static void main(String[] args) {

        GestorDeCalificaciones gestor = new GestorDeCalificaciones();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nMenu");
            System.out.println("Ingrese el nombre del estudiante");
            System.out.println("Mostrar alertas");
            System.out.println("Mostrar el mejor estudiante");
            System.out.println("Salir");

            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante");
                    String nombre = sc.next();
                    System.out.println("Ingrese el numero de materias");
                    int nummaterias = sc.nextInt();
                    System.out.println("Ingrese el numero de evaluaciones");
                    int numevaluaciones = sc.nextInt();

                    Estudiante estudiante = new Estudiante(nombre, nummaterias, numevaluaciones);

                   for (int i = 0; i < nummaterias; i++){
                       double[] Evaluaciones = new double[numevaluaciones];
                       System.out.println("Ingrese la evaluacion para la materia " + (i+1) + ":");
                       for (int j = 0; j < numevaluaciones; j++){
                           Evaluaciones[j] = sc.nextDouble();
                       }
                       estudiante.setCalificaciones(Evaluaciones);
                   }
                   gestor.agregarEstudiante(estudiante);
                   break;
                case 2:
                    System.out.println("\nMostrando alertas:");
                    for (Estudiante est : gestor.estudiantes){
                        System.out.println(est);
                    }
                    break;
                case 3:
                    Estudiante mejor = gestor.buscarMejorEstudiante();
                    if (mejor != null){
                        System.out.println("\nEl mejor estudiante es: ");
                        mejor.mostrarCalificaciones();
                        System.out.println("Promedio general: " + mejor.calcularPromedioGeneral());
                    }else {
                        System.out.println("No hay estudiantes registrados");
                    }
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion no valida");
            }

        }
    }
}
