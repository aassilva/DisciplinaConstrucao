package br.ufg.inf.es.construcao.luhn;

/**
 * Created by alunoinf on 24/09/15.
 */
public class Luhn {
    public static int luhn(int[]n){
        if (n.length < 2){
            throw new IllegalArgumentException("k invalido");
        }
        int i = 0;
        int p = 0;
        int l = n.length -1;
        boolean a = false;
        while (l > 0){
            if (a){
                p = p + n[l];
            } else {
                int t = n[l] * 2;
                i = i +(t / 10) + (t % 10);
            }
            l = l - 1;
            a = ! a;
        }
        return 10 - ((i + p) % 10);
    }
}
