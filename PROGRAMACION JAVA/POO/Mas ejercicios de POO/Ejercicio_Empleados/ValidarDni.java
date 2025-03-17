package Ejercicio_Empleados;

public class ValidarDni {
    public static void validarDni(String Dni) throws Exception {
    if(Dni.matches("^[0-9]{10}$")) {
        throw new Exception("El formato de DNI introducido no es valido");

    }
    }
}
