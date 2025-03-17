package VALIDAR_CON_ESTATICO;

public class EjemploUsoEstatic {
    public static void main(String[] args) {

        /*Los metodos estaticos sirven para llamar el objeto sin necesidad de instanciar.
        Ejemplo abajo*/
        System.out.println("Personas creadas " + ComoUsarStatic.getPersonasCreadas());
        ComoUsarStatic persona1 = new ComoUsarStatic("pepe","ca",10);
        System.out.println("Numero de personas creadas " + ComoUsarStatic.getPersonasCreadas());
        System.out.println("Numero de personas creadas " + persona1.getPersonasCreadas());

        ComoUsarStatic persona2 = new ComoUsarStatic("pepe","ca",5);
        System.out.println("Numero de personas creadas " + ComoUsarStatic.getPersonasCreadas());
    }
}
