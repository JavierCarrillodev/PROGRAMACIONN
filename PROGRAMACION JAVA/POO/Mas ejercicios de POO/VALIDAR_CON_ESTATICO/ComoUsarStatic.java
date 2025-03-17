package VALIDAR_CON_ESTATICO;

public class ComoUsarStatic {
    private static int PersonasCreadas = 0;

    private String nombre;
    private String apellido;
    private int edad;

    public ComoUsarStatic(String nombre, String apellido, int edad) {
        //Llamamos al metodo estatico que está ubicado en otra clase, y lo usamos para validar la edad
        if (!PersonaValidacion.validarEdad(edad)) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        PersonasCreadas++;
    }

    public static int getPersonasCreadas() {
        return PersonasCreadas;
    }

    public static void setPersonasCreadas(int personasCreadas) {
        PersonasCreadas = personasCreadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String Saludando() {
        return "Hola " + nombre + " " + apellido + " usteded tiene " + edad;
    }
}
