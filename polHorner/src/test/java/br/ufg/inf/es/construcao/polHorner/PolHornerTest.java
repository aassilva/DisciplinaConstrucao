package br.ufg.inf.es.construcao.polHorner;

import org.junit.Assert;
import org.junit.Test;

public class PolHornerTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() throws Exception {
        int []d = {3,5,7};
        PolHorner.polHorner(3, -1, d);
    }

    @Test
    public void testCasosDeFronteira() {
        int []d = {2, 2, 2};
        Assert.assertEquals(4, PolHorner.polHorner(1, 1, d));
    }

    @Test
    public void testCasoTrivial() {
        int []d = {2, 3, 5, 9};
        Assert.assertEquals(19, PolHorner.polHorner(1, 3, d));
    }

}
