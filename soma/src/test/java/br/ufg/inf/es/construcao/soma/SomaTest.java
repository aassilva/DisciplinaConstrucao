package br.ufg.inf.es.construcao.soma;

import org.junit.Assert;
import org.junit.Test;

public class SomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Soma.soma(-1, 8);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Soma.soma(0, 0));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(10, Soma.soma(7, 3));
        Assert.assertEquals(11, Soma.soma(8, 3));
        Assert.assertEquals(20, Soma.soma(7, 13));
        Assert.assertEquals(15, Soma.soma(7, 8));
    }

}
