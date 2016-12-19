package factorial;

public class Factorial {

    public static void main(String[] args) {

        int juego;
        int factor;

        juego = 8;

        int intentos;
        if (juego == 0) {
            factor = 1;
        } else {
            factor = 1;
            for (intentos = juego; intentos >= 1; intentos--) {
                factor = factor * intentos;
            }
        }

        System.out.println(factor);

    }

}
