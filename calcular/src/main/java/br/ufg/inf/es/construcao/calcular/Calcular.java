package br.ufg.inf.es.construcao.calcular;

/**
 * Classe que ler um numero x e retorna y.
 */
public class Calcular {

    /**
     * ler um número x e calcular e retorna o valor de y.
     *
     * @param x número inteiro de entrada.
     * @return o valor de y.
     */

    public static int calcular (int x) {
        if (x < 1) {
            int y = x;
            return y;
        } else {
            if (x == 1) {
                int y = 0;
                return y;
            }
            int y = (x * x);
            return y;
        }
    }
}
