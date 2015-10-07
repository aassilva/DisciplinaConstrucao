package br.ufg.inf.es.construcao.calcular;

import org.junit.Assert;
import org.junit.Test;

public class CalcularTest {

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(9, Calcular.calcular(3));
        Assert.assertEquals(-12, Calcular.calcular(-12));
        Assert.assertEquals(0, Calcular.calcular(1));
    }

}
