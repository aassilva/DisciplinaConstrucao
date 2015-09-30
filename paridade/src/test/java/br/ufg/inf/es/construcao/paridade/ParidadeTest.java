package br.ufg.inf.es.construcao.paridade;

import org.junit.Assert;
import org.junit.Test;

public class ParidadeTest {

    @Test
    public void testImpares() throws Exception {
        Assert.assertFalse(Paridade.par(1));
    }

    @Test
    public void testPares() throws Exception {
        Assert.assertTrue(Paridade.par(2));
    }
}
