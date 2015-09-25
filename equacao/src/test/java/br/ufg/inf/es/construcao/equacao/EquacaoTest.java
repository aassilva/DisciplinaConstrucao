package br.ufg.inf.es.construcao.equacao;

import junit.framework.Assert;
import org.junit.Test;

public class EquacaoTest {

    @Test
    public void testUnico(){
        Assert.assertEquals(6489, Equacao.equacao());
    }
}
