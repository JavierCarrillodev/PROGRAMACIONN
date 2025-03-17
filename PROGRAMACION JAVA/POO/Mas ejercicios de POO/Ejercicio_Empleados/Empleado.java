package Ejercicio_Empleados;

import java.util.Objects;

public class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private Departamentos departamentos;
    private boolean teletrabajo;
    private Empresa empresa;
    private static double salarioBase = 1000;


    public Empleado(String dni, String nombre, int edad, Departamentos departamentos, boolean teletrabajo, Empresa empresa) {
        try {
            ValidarDni.validarDni(dni);
        }catch (Exception ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
        if (empresa == null) {
            throw new IllegalArgumentException("La empresa es obligatoria");
        }
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.departamentos = departamentos;
        this.teletrabajo = teletrabajo;
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    public double calcularSueldo() {
        double salario = Empleado.salarioBase;

        if (this.edad > 30) {
            salario += 200;
        }
        salario += this.departamentos.getPlus();

      if (this.teletrabajo){
            salario += 30;
        }
      return salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public boolean isTeletrabajo() {
        return teletrabajo;
    }

    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Empleado.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", departamentos=" + departamentos +
                ", teletrabajo=" + teletrabajo +
                ", empresa=" + empresa +
                '}';
    }
}
