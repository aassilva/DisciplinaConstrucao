package br.ufg.inf.es.construcao.crivoEratostenes;

import junit.framework.Assert;
import org.junit.Test;

public class PassagemPorValorOuReferenciaTest {

    @Test
    public void testPassagemPorValor() {
        int x = 10;
        PassagemPorValorOuReferencia.acrescentaUm(x);
        Assert.assertEquals(10, x);
    }

}
