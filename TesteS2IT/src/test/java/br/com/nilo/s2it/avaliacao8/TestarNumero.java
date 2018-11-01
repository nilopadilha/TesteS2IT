package br.com.nilo.s2it.avaliacao8;

import org.junit.Assert;
import org.junit.Test;

public class TestarNumero {
	@Test
    public void NumeroIgualMenosUm() {

        /*inicializando as variáveis*/
        Integer c = -1;
        Integer a = 10256;
        Integer b = 512;

        /*criando novo número */
        Numero num = new Numero();


        /*valida se o número é -1*/
        Assert.assertEquals(c, num.c(a, b));

    }


    @Test
    public void NumeroIgual() {

    	 /*inicializando as variáveis*/
        Integer c = 150122;
        Integer a = 102;
        Integer b = 512;

        /*criando novo número */
        Numero num = new Numero();


        /*valida se o número C é igual a A e B se intercalando*/
        Assert.assertEquals(c, num.c(a, b));

    }


}
