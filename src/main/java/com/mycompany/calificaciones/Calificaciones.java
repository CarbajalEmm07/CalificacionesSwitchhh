/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificaciones;

import java.util.Scanner;

/**
 *
 * @author emmanuel
 */
public class Calificaciones {
Scanner entrada = new Scanner(System.in);
    static int nota;

    public void Datos() {
        System.out.print("Introduzca una calificacion (1-10), pulse Enter:"); 
        nota= entrada.nextInt(); 
        
        switch (nota) {
            case 10:
            case 9:
                System.out.println("Exelente");
                break;
            case 8:
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Aprobado");
                break;
            case 5:
                System.out.println("Reprobado");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Suspendido");
            default:
                System.out.println("No es posible esta nota");
        }
    }

    public static void main(String[] args) {
       CalificacionesSwitch mostrar= new CalificacionesSwitch();
       mostrar.Datos();
    }

}
