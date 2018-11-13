/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_8_12;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_8_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean repetir;
        int alumnos =1;
        do{
            System.out.println("Alumno " + alumnos + ": ");
            int suma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("Inserta nota " + i + ": ");
                suma += scan.nextInt();
            }

            System.out.println("Alumno "+alumnos+": Nota media: " + (suma / 6));
            System.out.println("nuevo alumno? 1 si / 0 no");
            if(scan.nextInt()==1){
                repetir= true;
                alumnos++;
            }else repetir = false;
        }while(repetir);
    }
}
