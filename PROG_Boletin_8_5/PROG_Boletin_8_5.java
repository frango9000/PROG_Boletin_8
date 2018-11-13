/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_5;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acumulador=0;
        int positivo;
            do {
                positivo = scan.nextInt();
                if (positivo>=0){
                System.out.println(positivo);   
                acumulador +=positivo;
                }
            } while (positivo >= 0);
        System.out.println("Acumulado: " + acumulador);
    }
}
