/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeros_ej_enjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    public static void main(String[] args){
        
        int totalh;
        int totalapagar;
        Scanner imput = new Scanner(System.in);
        System.out.print("\nIngrese cantidad de horas trabajadas en todo el mes: ");
        totalh=imput.nextInt();
        totalapagar=350*totalh;
        System.out.print("\nEl sueldo del empleado es de: $");
        System.out.print(totalapagar);
          }
    
}
