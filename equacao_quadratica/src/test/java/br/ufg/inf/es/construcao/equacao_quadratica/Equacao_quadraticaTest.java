package br.ufg.inf.es.construcao.equacao_quadratica;

import org.junit.Assert;
import org.junit.Test;

public class Equacao_quadraticaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Equacao_quadratica.equacao_quadratica(-1, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Equacao_quadratica.equacao_quadratica(9, -5, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Equacao_quadratica.equacao_quadratica(1, 10, -8);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Equacao_quadratica.equacao_quadratica(0, 0, 0));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(64, Equacao_quadratica.equacao_quadratica(5, 12, 4));
        Assert.assertEquals(240, Equacao_quadratica.equacao_quadratica(7, 18, 3));
    }

}
