public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        //Se  va a repetir hasta que llegue a 5
        while (i <= 5){
            System.out.println("i = " + i);
            //Con el i++ se va a ir incrementando hasta 5
            i++;
        }

        i = 0;
        boolean prueba = true;
        //Se va a ejecutar hasta que llegue a 7 y entonces pare porque se le ha ordenado, con la prueba = false
        //Si no se le pone prueba = false entonces será un bucle infinito
        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("Prueba " + prueba);
            i++;
        }

        //Do while ejecuta al menos una vez y después evaluára la condición
        prueba = false;
        do{
            System.out.println("se ejecutara al menos una vez");
        }while (prueba);

        prueba = true;
        i=1;


        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
            }while(prueba);
    }
}

