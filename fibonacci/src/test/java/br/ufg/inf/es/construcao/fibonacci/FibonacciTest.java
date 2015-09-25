package br.ufg.inf.es.construcao.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fibonacci.fibonacci(-1);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Fibonacci.fibonacci(0));
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(13, Fibonacci.fibonacci(7));
        Assert.assertEquals(2, Fibonacci.fibonacci(3));
        Assert.assertEquals(1597, Fibonacci.fibonacci(17));
        Assert.assertEquals(28657, Fibonacci.fibonacci(23));
        Assert.assertEquals(2178309, Fibonacci.fibonacci(32));
    }

}