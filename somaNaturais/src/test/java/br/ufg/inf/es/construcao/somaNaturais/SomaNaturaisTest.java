package br.ufg.inf.es.construcao.somaNaturais;

import junit.framework.Assert;
import org.junit.Test;

public class SomaNaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception{
        SomaNaturais.soma(-2);
    }

    @Test
    public void testCasosTrivial() {
        Assert.assertEquals(15, SomaNaturais.soma(5));
        Assert.assertEquals(500500, SomaNaturais.soma(1000));
        Assert.assertEquals(120, SomaNaturais.soma(15));
        Assert.assertEquals(45, SomaNaturais.soma(9));
        Assert.assertEquals(325, SomaNaturais.soma(25));
    }

}
