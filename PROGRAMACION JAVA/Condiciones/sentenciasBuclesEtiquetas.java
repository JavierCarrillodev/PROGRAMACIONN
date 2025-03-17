public class sentenciasBuclesEtiquetas {
    public static void main(String[] args) {

        /*En este programa le estamos indicando que i sean los dias de la semana y j las horas que estamos trabajando
        suponiendo que trabajamos 8 horas*/
        bucle:
        for (int i = 1; i <= 7; i++){
            int j = 1;
            //También podríamos usar un for en vez de un while
            while(j <= 8){
                if (i == 6 || i == 7){
                    System.out.println("Dia " + i + ": Descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", trabajando  a las " + j + "hrs. ");
                j++;
            }
        }

    }
}
