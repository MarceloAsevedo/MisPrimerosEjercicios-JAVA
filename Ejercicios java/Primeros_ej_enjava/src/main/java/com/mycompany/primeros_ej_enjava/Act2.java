/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.primeros_ej_enjava;

import java.util.Scanner;

/**
Actividad 2:
Desarrollar un programa que determine el menor número de billetes de: 1000, 500, 200, y 100 $ que deberá entregar un cajero automático en una extracción de cierta cantidad de dinero (siempre múltiplo de 100, tal como sucede en la actualidad)

 */
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       int sueldo,retiro;
    int billetemil,billete500,billete200,billete100;
    Scanner imput = new Scanner(System.in);
    System.out.print("\nIngrese su saldo: $");
    sueldo=imput.nextInt();
    System.out.print("\nRecuerde que este cajero solo usa billetes de $1.000, $500, $200 y $100");
    System.out.print("\n¿Cuánto desea retirar?: ");
    retiro=imput.nextInt();
     billetemil= retiro/1000;
      retiro= retiro-(billetemil*1000);
     System.out.print("\nBilletes de $1.000: "+billetemil);
     billete500= retiro/500;
      retiro= retiro-(billete500*500);
     System.out.print("\nBilletes de $500: "+billete500);
     billete200= retiro/200;
     retiro= retiro-(billete200*200);
     System.out.print("\nBilletes de $200: "+billete200);
     billete100= retiro/100;
     retiro= retiro-(billete100*100);
     System.out.print("\nBilletes de $100: "+billete100);
     System.out.print("\nSu saldo ahora es de: $"+(sueldo-retiro));
    }
}
