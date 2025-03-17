package POO.sorpresa2;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private int potencia;

    public Electrodomestico(String tipo, String marca, int potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
    public int getConsumo(int horas) {
        return horas * potencia;
    }
    public double getCosteConsumo(int horas, double costeHora){
        double consumo = getConsumo(horas);
        return consumo * costeHora;

    }
}
