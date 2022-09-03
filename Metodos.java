public class Metodos {

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        return num;
    }
}
