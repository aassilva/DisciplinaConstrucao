package br.ufg.inf.es.construcao.polHorner;

/**
 * Classe que implementa Pol-Horner.
 */
public class PolHorner {
    public static int polHorner(int x, int g, int []a){
        if (g < 0){
            throw new IllegalArgumentException("g invalido.");
        }
        int p;
        p = a[g];
        for (int i = g - 1; i >= 0; i--){
            p = p * x + a[i];
        }
        return p;
    }
}
