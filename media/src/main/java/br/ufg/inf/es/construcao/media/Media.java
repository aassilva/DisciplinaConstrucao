package br.ufg.inf.es.construcao.media;

/**
 * Classe que implementa a média de tres números.
 */
public class Media {

    /**
     * Calcula a Média aritmética de três termos.
     *
     * @param a Primeira entrada.
     * @param b segunada entrada;
     * @param c Terceira entrada.
     * @return Média dos três termos.
     */

    public static int media (int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("a, b ou c invalido!");
        }
        int resultado = ((a + b + c)/3);
        return resultado;
    }
}
