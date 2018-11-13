/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_10;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int suma=0;
        
        for(int i =1;i<=6;i++){
            System.out.println("Inserta nota "+i+": ");
            suma += scan.nextInt();
        }        
        System.out.println("media: " + (suma/6));        
    }
    
}
