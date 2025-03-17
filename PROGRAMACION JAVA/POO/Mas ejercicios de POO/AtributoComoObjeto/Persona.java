package AtributoComoObjeto;

import VALIDAR_CON_ESTATICO.PersonaValidacion;

public class Persona {
    private static int PersonasCreadas = 0;

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La debe existir");
        }
        //Llamamos al metodo estatico que está ubicado en otra clase, y lo usamos para validar la edad
        if (!PersonaValidacion.validarEdad(edad)) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Hola " + nombre + " " + apellido + " usteded tiene " + edad + " años " + "con direccion " + direccion.toString();
    }
}
