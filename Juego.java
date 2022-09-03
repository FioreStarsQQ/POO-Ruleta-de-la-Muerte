public class Juego {

    private Jugador[] jugadores; // a los atributos no se les da valor, solo a las constantes
    private Revolver revolver;

    public Juego(int numJugadores) {

        jugadores = new Jugador[comprobarJugadores(numJugadores)];
        crearJugadores();
        revolver = new Revolver();
        System.out.println(revolver);

    }

    private int comprobarJugadores(int numJugadores) {
        if (!(numJugadores >= 1 && numJugadores <= 6)) { // si no esta esta entre 1 y 6
            numJugadores = 6; // cuando se pase un numero fuera del rango automaticamente iran 6 jugadores
        }
        return numJugadores;
    }

    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }

    public boolean finJuego() {
        for (int i = 0; i < jugadores.length; i++) { // recorre los jugadores
            if (!jugadores[i].isVivo()) { // verifica si esta vivo o muerto, muerto para terminar
                return true; // si esta muerto retorna verdad porque terminara el juego
            }
        }
        return false; // si ninguno murio continua el juego
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {

            jugadores[i].disparar(revolver);
            System.out.println(revolver);
            if (!jugadores[i].isVivo()){ // si jugador no esta vivo
                return; // es como un break que sale del bucle
            }
        }

    }

}
