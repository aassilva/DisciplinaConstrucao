package br.ufg.inf.es.construcao.potencia;

import org.junit.Assert;
import org.junit.Test;

public class PotenciaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Potencia.potencia(-1, 10);
    }
     @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Potencia.potencia (1, -9);
    }

    @Test
    public void testcasoDeFronteira() {
        Assert.assertEquals(1, Potencia.potencia(10, 0));
        Assert.assertEquals(1, Potencia.potencia(5, 0));
    }

    @Test
    public void TestcasoTriviais() {
        Assert.assertEquals(8, Potencia.potencia(2, 3));
    }
}