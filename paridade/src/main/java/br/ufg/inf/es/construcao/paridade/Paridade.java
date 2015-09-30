package br.ufg.inf.es.construcao.paridade;

/** Classe que implementa a paridade dos numeros.
 *
 */

public class Paridade {
    /**
     * Verifica se um numero é par.
     *
     * @param numero numero de entrada inteiro.
     * @return True se par e false se impar.
     */

    public static boolean par(int numero) {
        if (numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}