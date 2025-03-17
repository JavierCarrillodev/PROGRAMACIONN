package Gestor_de_notas_Estudiantes;

public class Estudiante {
    protected String nombre;
    protected double[][] calificaciones; //[materia][evaluaciones]

    public Estudiante(String nombre,int materia, int evaluaciones) {
        this.nombre = nombre;
        this.calificaciones = new double[materia][evaluaciones];
    }

    public double[] calcularPromedioPorMateria(){
       double suma = 0;
        double[] promedios = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones.length;
        }
        return promedios;
    }
    public double calcularPromedioGeneral(){
        double[] promediosPorMateria = this.calcularPromedioPorMateria();
        double sumaTotal = 0;
        for (double promedio : promediosPorMateria) {
            sumaTotal += promedio;
        }
        return sumaTotal / promediosPorMateria.length;
    }
    public void mostrarCalificaciones(){
        System.out.println("Calificaciones de " + this.nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Materia " +(i + 1) + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("Evaluaciones " +(j + 1) + ": " + calificaciones[i][j]);
            }
        }
    }

    public void setCalificaciones(double[] calificaciones){
        this.calificaciones = new double[][]{calificaciones};
    }
}
