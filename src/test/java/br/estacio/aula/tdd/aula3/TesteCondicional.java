/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.aula.tdd.aula3;

import br.estacio.aula.tdd.model.Programa;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Marcelo
 */
public class TesteCondicional {
    @Test
    public void testeVerdadeiroVerdadeiro(){
        double a=2;
        double b=0;
        double x=1;
        
        Programa p = new Programa();
        
        double valorEsperado = p.exemplo(a, b, x);
        
        Assert.assertEquals(valorEsperado, 1.5d,1);
    }
    @Test
    public void testeVerdadeiroFalso(){
        double a=2;
        double b=1;
        double x=1;
        
        Programa p = new Programa();
        
        double valorEsperado = p.exemplo(a, b, x);
        
        Assert.assertEquals(valorEsperado, 2,1);
    }
}
