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
public class ejercicio2 {
     public static void main(String[] args){
        String nombre;
        int nota1,nota2,nota3;
        float prom;
        Scanner imput = new Scanner(System.in);
        System.out.print("\nIngrese nombre del alumno: ");
        nombre = imput.nextLine();
        System.out.print("\nIngrese la primer nota: ");
        nota1=imput.nextInt();
        System.out.print("\nIngrese la segunda nota: ");
        nota2=imput.nextInt();
        System.out.print("\nIngrese la tercera nota: ");
        nota3=imput.nextInt();
        prom=(float)(nota1+nota2+nota3)/3;
        System.out.print("El promedio de ");
        System.out.print(nombre);
        System.out.print(" es de: ");
        System.out.print(prom);
    }
}
