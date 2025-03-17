package Electrodomestico;

public class Lavadora extends Electrodomestrico {
    private double precio;
    private boolean aguaCaliente;


    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String getTipo() {
        if (tipo != null) {
            return super.getTipo();
        } else {
            return "No especificado";
        }
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public double getPotencia() {
        return super.getPotencia();
    }


    public double getPrecio() {
        return precio;
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setPotencia(double potencia) {
        super.setPotencia(potencia);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public double getConsumo(int horas) {
        if (!aguaCaliente) {
            return horas * this.potencia;
        } else {
            return horas * (this.potencia + this.potencia * 0.20);
        }
    }

    @Override
    public double getCosteConsumo(int horas, double costeHora) {
        return super.getCosteConsumo(horas, costeHora);
    }

    @Override
    public String toString() {
        return "Lavadora:" +
                "Precio=" + precio +
                "\nAguaCaliente:" + aguaCaliente +
                "\nTipo:" + getTipo() +
                "\nMarca:" + marca +
                "\nPotencia:" + potencia;
    }
}