package EXAMEN;

public class FraccionSimplificada extends Fracciones {
    public FraccionSimplificada(int num, int den) {
        super(num, den);
    }

    @Override
    public Fracciones sumar(Fracciones fracciones) {
        return super.sumar(fracciones);
    }

    @Override
    public Fracciones restar(Fracciones fracciones) {
        return super.restar(fracciones);
    }

    @Override
    public Fracciones multiplicar(Fracciones fracciones) {
        return super.multiplicar(fracciones);
    }

    @Override
    public Fracciones dividir(Fracciones fracciones) {
        return super.dividir(fracciones);
    }
    private int mcd(Fracciones fracciones) {
        int u = Math.abs(fracciones.getNum());
        int v = Math.abs(fracciones.getDen());
        while (v != 0){
            int r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
