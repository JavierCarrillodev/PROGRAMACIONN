package Ejercicio_Empleados;

public class Main {
    public static void main(String[] args) {

        try {

            Empresa empresa = new Empresa("123fsdf","JS");
            Empleado empleado = new Empleado("12345678E","Javi",34,Departamentos.INFORMATICA,true,empresa);
            Empleado empleado2 = new Empleado("1222345678E","Javi",21,Departamentos.DIRECCION,false,empresa);

            System.out.println("Empleado 1 " + empleado.calcularSueldo());
            System.out.println("Empleado 2 " + empleado2.calcularSueldo());

            Empleado.setSalarioBase(2000);
            System.out.println("Empleado 1 " + empleado.calcularSueldo());
            System.out.println("Empleado 2 " + empleado2.calcularSueldo());
            if (empleado.equals(empleado2)) {
                System.out.println("Son iguales");
            }else {
                System.out.println("Son diferentes");
            }

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
