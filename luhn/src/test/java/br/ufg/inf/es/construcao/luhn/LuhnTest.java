package br.ufg.inf.es.construcao.luhn;

import org.junit.Assert;

public class LuhnTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() throws Exception {
        int []d = {3};
        Luhn.luhn(d);
    }

    @org.junit.Test
    public void testCasoTrivial() {
        int []d = {4, 9, 8, 4, 2, 3, 7, 0, 4, 8, 2, 2, 4, 8, 0, 2};
        Assert.assertEquals(8, Luhn.luhn(d));
    }
}
