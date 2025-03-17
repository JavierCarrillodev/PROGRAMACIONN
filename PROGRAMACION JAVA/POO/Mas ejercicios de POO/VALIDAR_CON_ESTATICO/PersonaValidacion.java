package VALIDAR_CON_ESTATICO;

public class PersonaValidacion {

    public static boolean validarEdad(int edad) {
        return edad > 0 && edad <= 99;
    }
}
