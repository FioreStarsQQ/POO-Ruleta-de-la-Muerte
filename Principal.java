public class Principal {
    public static void main(String[] args) {
        Juego juego = new Juego(6);

        while (!juego.finJuego()) { // mientra no termina el juego pues continua
            juego.ronda();
        }
        System.out.println("El juego ha terminado.");
    }
}
