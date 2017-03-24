/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.aula.tdd.model;

/**
 *
 * @author Marcelo
 */
public class Programa {
    
    public double  exemplo(double a, double b, double x){
        
        if((a<1) && (b==0)){
            x = x/a;
        } else if (a==2 || x>1){
            x = x + 1;
        }
        return x;
    }
    
}
