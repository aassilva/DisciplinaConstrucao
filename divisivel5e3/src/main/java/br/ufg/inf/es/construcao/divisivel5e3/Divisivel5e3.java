package br.ufg.inf.es.construcao.divisivel5e3;

/**
 * Classe que verifica se um numero é divisivel por 5 e po 3 ao mesmo tempo.
 */
public class Divisivel5e3 {

    /**
     * verifica se um numero é divisivel por 5 e po 3 ao mesmo tempo.
     *
     * @param n número de entrada inteiro positivo.
     * @return true se for divisivel por 5 e 3 ao mesmo tempo,
     * false se não for.
     */

    public static boolean divisivel5e3(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        } else {
            if (n % 3 == 0 && n % 5 == 0) {
                return true;
            }
            return false;
        }
    }
}
