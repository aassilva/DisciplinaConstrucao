package br.ufg.inf.es.construcao.propriedade;

/**
 * Classe que implementa propriedade.
 */
public class Propriedade {

    /**
     *implementação da propriedade 153.
     * @param n entrada.
     * @return True se satisfaz e false se não satisfaz
     */

    public static boolean propriedade (int n){
        if (n <0 || n > 999) {
            throw new IllegalArgumentException("n invalido!");
        }

        int i = n / 100;
        int j = ((n - 100 * i) / 10);
        int k = n % 10;
        return (((Math.pow(i,3)) + (Math.pow(j,3)) + (Math.pow(k,3))) == n);
    }
}