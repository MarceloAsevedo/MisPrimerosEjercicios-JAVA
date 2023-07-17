/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.primeros_ej_enjava;

import java.util.Scanner;

/**
Actividad 1:
Desarrolle un programa Java que permita cargar por teclado un número entero que representa la cantidad de segundos que pasaron desde un evento dado. El programa debe convertir esa cantidad de segundos a la cantidad de horas, minutos y segundos que transcurrieron.
Por ejemplo, si la cantidad de segundos ingresada es 4452 deberá mostrar un mensaje que informe que el tiempo transcurrido fue de 1 hora, 14 minutos y 12 segundos.

 */
public class Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int seg, hora, mins;
      Scanner imput = new Scanner(System.in);
      System.out.print("\nBienvenido al programita para convertir segundos en horas, minutos y segundos");
      System.out.print("\nIngrese la cantidad de segundos:");
      seg= imput.nextInt();
         hora=seg/3600;
         seg=seg%3600;
         mins= seg/60;
         seg=seg%60;
      System.out.print("\nSon "+hora+":"+mins+":"+seg);
    }
}
