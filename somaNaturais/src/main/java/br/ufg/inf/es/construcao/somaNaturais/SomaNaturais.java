package br.ufg.inf.es.construcao.somaNaturais;

/**
 * Classe que soma os numeros naturais.
 */

public class SomaNaturais {

    /**
     * Soma dos numeros naturais.
     * @param n entrada de dados
     * @throws n menor que 1.
     * @return Saida de dados (soma dos numeros naturais).
     */

    public static int soma (int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N invalido!");
        }

        int i =2;
        int s = 1;
        while (i <= n) {
            s += i;
            i++;
        }

        return s;
    }
}
