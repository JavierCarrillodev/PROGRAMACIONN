package AtributoComoObjeto;
public class Direccion {
        private String calle;
        private int numero;

        private String localidad;
        private String pronvicia;
        private Direccion direccion;

        public Direccion(String calle, int numero, String localidad, String pronvicia ) {
            //Llamamos al metodo estatico que está ubicado en otra clase, y lo usamos para validar la edad


            this.calle = calle;
            this.numero = numero;
            this.localidad = localidad;
            this.pronvicia = pronvicia;
            this.direccion = direccion;
        }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPronvicia() {
        return pronvicia;
    }

    public void setPronvicia(String pronvicia) {
        this.pronvicia = pronvicia;
    }

    public String toString() {
            return  calle + " " + numero + localidad + "  " + pronvicia;
        }


}

