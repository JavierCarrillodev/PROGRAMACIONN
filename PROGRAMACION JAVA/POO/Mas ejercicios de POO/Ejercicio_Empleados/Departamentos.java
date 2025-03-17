package Ejercicio_Empleados;

public enum Departamentos {
    CONTABILIDAD(50),
    INFORMATICA(80),
    DIRECCION(100);
    private double plus;
    private Departamentos(double plus) {
        this.plus = plus;
    }
    public double getPlus() {
        return plus;
    }

}
