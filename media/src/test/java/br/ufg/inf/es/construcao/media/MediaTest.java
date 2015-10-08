package br.ufg.inf.es.construcao.media;

import org.junit.Assert;
import org.junit.Test;

public class MediaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Media.media(-1, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Media.media(9, -5, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Media.media(1, 10, -8);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0,  Media.media(0, 0, 0));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(7,  Media.media(5, 12, 4));
        Assert.assertEquals(9,  Media.media(7, 18, 2));
        Assert.assertEquals(6,  Media.media(7, 8, 3));
        Assert.assertEquals(4,  Media.media(7, 2, 3));
    }

}
