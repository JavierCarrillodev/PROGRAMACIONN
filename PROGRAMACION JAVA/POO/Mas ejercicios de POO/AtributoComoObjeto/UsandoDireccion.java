package AtributoComoObjeto;

public class UsandoDireccion {
    public static void main(String[] args) {

        Direccion direccion = new Direccion("null ",6," palma","cordoba");
        Persona persona = new Persona("Javi","Carrillo",21, direccion);
        System.out.println(persona);
    }
}
