public class persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String Dni;

    public persona(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.Dni = "Desconocido";
        this.apellido = "Desconocido";
    }
    public persona(String nombre, String apellido, int edad, String Dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Dni = Dni;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad < 0){
            this.edad = edad;
        }else
            System.out.println("Edad no valida");

    }
    persona persona1 = new persona(this.nombre, this.apellido, this.edad, this.Dni);

}
