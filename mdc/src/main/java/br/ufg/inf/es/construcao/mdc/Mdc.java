package br.ufg.inf.es.construcao.mdc;

/**
 * Classe que implementa mdc entre dois número a e b.
 * a maior ou igual a b.
 * b maior que 0.
 */
public class Mdc {
    /**
     * Retorna o maximo divisor comum entre dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O maximo divisor comum.
     */
    public static int mdc(int a, int b) {
        if (a >= b && b > 0) {
            while (b != 0) {
                int m;
                m = a % b;
                a = b;
                b = m;
            }
            return a;
        } else {
            throw new IllegalArgumentException("a ou b invalido");
        }
    }
}
