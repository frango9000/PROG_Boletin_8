/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_11;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int j = 1; j <= 3; j++) {
            System.out.println("Alumno " + j + ": ");
            int suma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("Inserta nota " + i + ": ");
                suma += scan.nextInt();
            }

            System.out.println("Alumno "+j+": Nota media: " + (suma / 6));
        }
    }
}
