/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.primeros_ej_enjava;

import java.util.Scanner;

/**
 Actividad 03:
Escribir un programa que lea la hora de un día de notación de 24 horas y genera una salida como respuesta en formato 12 horas.
Por ejemplo, si la entrada es 13:45, la salida será: 1:45 PM El programa pedirá al usuario que introduzca horas y minutos por separado.

 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       int hora, min;
        Scanner imput = new Scanner(System.in);
        System.out.print("\nEste programita está hecho para pasar del formato 24hs al formato 12hs");
        System.out.print("\nIngrese hora:");
       hora=imput.nextInt();
        System.out.print("\nIngrese minutos:");
       min=imput.nextInt();
       switch(hora){
           case 1,13:
           hora=1;
           break;
           case 2,14:
           hora=2;
           break;
           case 3,15:
           hora=3;
           break;
           case 4,16:
           hora=4;
           break;
           case 5,17:
           hora=5;
           break;
           case 6,18:
           hora=6;
           break;
           case 7,19:
           hora=7;
           break;
           case 8,20:
           hora=8;
           break;
           case 9,21:
           hora=9;
           break;
           case 10,22:
           hora=10;
           break;
           case 11,23:
           hora=11;
           break;
           case 12,24,0:
           hora=12;
           break;
       }
       System.out.print("\nLa hora es: "+hora+":"+min);
    }
}
