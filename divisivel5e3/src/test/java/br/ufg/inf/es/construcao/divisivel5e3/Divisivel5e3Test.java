package br.ufg.inf.es.construcao.divisivel5e3;

import org.junit.Assert;
import org.junit.Test;

public class Divisivel5e3Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Divisivel5e3.divisivel5e3(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(true, Divisivel5e3.divisivel5e3(75));
        Assert.assertEquals(false, Divisivel5e3.divisivel5e3(13));
    }

}