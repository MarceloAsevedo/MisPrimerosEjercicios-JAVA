/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeros_ej_enjava;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
     public static void main(String[] args){
        int nro1,nro2;
        double div;
        Random r = new Random();
        Random s = new Random();
        nro1=(int)(r.nextDouble() * 100);
        nro2=(int)(s.nextDouble() * 100);
        div=(double)nro1/nro2;
        System.out.print("\nLos números son: "+nro1+ " y "+nro2);
        System.out.print("\nSuma =  ");
        System.out.print(nro1+nro2);
        System.out.print("\nResta = ");
        System.out.print(nro1-nro2);
        System.out.print("\nDivision = ");
        System.out.print(div);
        System.out.print("\nMultiplicación = ");
        System.out.print(nro1*nro2);
        
        
    }
    
}
