package br.ufg.inf.es.construcao.equacao_quadratica;

/**
 * Classe que implementa uma equação quadrática.
 */
public class Equacao_quadratica {
    /**
     * Calcula o valor de delta se os paramentros forem maior que o.
     *
     * @param a numero inteiro.
     * @param b numero inteiro.
     * @param c numero inteiro
     * @return valor de delta.
     */
    public static int equacao_quadratica(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("a, b ou c invalido");
        }
        int delta;
        delta = ((b * b) - ((4 * a) * c));
        return delta;
    }
}