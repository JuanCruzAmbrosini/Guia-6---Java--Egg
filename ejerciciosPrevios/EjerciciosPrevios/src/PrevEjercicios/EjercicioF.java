/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrevEjercicios;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class EjercicioF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {

            System.out.println("Ambos números son mayores que 25.");

        } else if (num1 > 25) {

            System.out.println("El primer número es mayor a 25.");

        } else if (num2 > 25) {

            System.out.println("El segundo número es mayor a 25.");

        } else {

            System.out.println("Ninguno de los números es mayor a 25");

        }
    }
}