package br.ufg.inf.es.construcao.mdc;

import org.junit.Assert;
import org.junit.Test;

public class MdcTest {

    @Test(expected = IllegalArgumentException.class)
        public void testPrimeiroParametroInvalido() throws Exception {
            Mdc.mdc(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Mdc.mdc(5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Mdc.mdc(7, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuartoParametroInvalido() throws Exception {
        Mdc.mdc(5, 6);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(1, Mdc.mdc(1, 1));
        Assert.assertEquals(2, Mdc.mdc(2, 2));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1, Mdc.mdc(3, 1));
        Assert.assertEquals(91, Mdc.mdc(2275, 1638));
        Assert.assertEquals(8, Mdc.mdc(24, 16));
        Assert.assertEquals(32, Mdc.mdc(416, 352));
        Assert.assertEquals(3, Mdc.mdc(9, 3));
    }
}
