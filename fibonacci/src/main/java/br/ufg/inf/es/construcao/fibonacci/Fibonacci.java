package br.ufg.inf.es.construcao.fibonacci;

/**
 * Classe que implementa a seguência de Fibonacci.
 */
public class Fibonacci {
    /**
     * Calcula a seguência de Fibonacci.
     *
     * @param n entrada desejada a calcular.
     * @return Soma dos dois anteriores.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        } else {
            if (n == 0 || n == 1) {
                return n;
            }
            int a = 0;
            int c = 1;
            for (int i = 2; i <= n; i++) {
                int t;
                t = c;
                c = c + a;
                a = t;
            }
            return c;
        }
    }
}
