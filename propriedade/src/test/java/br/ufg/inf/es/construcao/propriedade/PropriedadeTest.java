package br.ufg.inf.es.construcao.propriedade;

import junit.framework.Assert;
import org.junit.Test;

public class PropriedadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Propriedade.propriedade(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Propriedade.propriedade(1000);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(true, Propriedade.propriedade(0));
        Assert.assertEquals(false, Propriedade.propriedade(999));
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(true, Propriedade.propriedade(153));
        Assert.assertEquals(false, Propriedade.propriedade(560));
    }
}
