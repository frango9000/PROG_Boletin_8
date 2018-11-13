/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_7;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_7 {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        float lado;
        String label="";
        do{
        System.out.println(label+"Introduce el lado del cuadrado: ");
        lado = scan.nextFloat();
        label="El numero debe ser positvo \n";
        }while(lado<0);
        float area = lado*lado;
        System.out.println("Area es : " + area);
    }
    
}
