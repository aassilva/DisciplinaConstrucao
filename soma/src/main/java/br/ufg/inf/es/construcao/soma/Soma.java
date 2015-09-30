package br.ufg.inf.es.construcao.soma;

/**
 * Classe que soma dois numeros.
 */
public class Soma {
    /**
     * Soma de dois numeros inteiros.
     *
     * @param a inteiro maior que o.
     * @param b inetiro maior que 0.
     * @return soma dos numeros.
     */
    public static int soma(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("a ou b invalido");
        }
        int r = a + b;
        return r;
    }
}
