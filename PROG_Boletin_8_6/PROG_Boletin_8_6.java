/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_6;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_6 {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado: ");
        float lado = scan.nextFloat();
        float area = lado*lado;
        System.out.println("Area es : " + area);
    }
    
}
