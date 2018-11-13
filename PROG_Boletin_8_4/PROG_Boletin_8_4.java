/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_4;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positivo;
            do {
                positivo = scan.nextInt();
                if (positivo<0) break;
                System.out.println(positivo);
            } while (positivo >= 0);
        
    }
}
