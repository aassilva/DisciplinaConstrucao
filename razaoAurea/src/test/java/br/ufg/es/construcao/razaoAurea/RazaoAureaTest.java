package br.ufg.es.construcao.razaoAurea;


import junit.framework.Assert;
import org.junit.Test;

public class RazaoAureaTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParamentroInvalido() throws Exception {
            RazaoAurea.razaoAurea(-1, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParamentroInvalido() throws Exception {
        RazaoAurea.razaoAurea(1, -6, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TerceiroParamentroInvalido() throws Exception {
        RazaoAurea.razaoAurea(1, 2, -5);
    }

    @Test
    public void CasosDeFronteiras() {
        Assert.assertEquals(1.61803398875, RazaoAurea.razaoAurea(1, 3, 500), 0.00001d);
    }

}
