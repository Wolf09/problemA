package org.swiset;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el Número de casos de prueba: ");
        int t = scanner.nextInt(); // Número de casos de prueba

        while (t-- > 0) {
            System.out.print("Ingrese el Número de juegos: ");
            int n = scanner.nextInt(); // Número de juegos
            System.out.print("Ingrese la Cadena  de secuencia del juego: ");
            String s = scanner.next(); // Secuencia de juegos

            int winsA = 0; // Número de victorias de A
            int winsB = 0; // Número de victorias de B
            int setsA = 0; // Número de sets ganados por A
            int setsB = 0; // Número de sets ganados por B

            // Valor de X (victorias necesarias para ganar un set)
            //int X = (int)(Math.random()*5+1);
            int X=3;
            // Valor de Y (victorias necesarias para ganar el juego)
            //int Y = (int)(Math.random()*5+1);
            int Y=1;
            // Contamos las victorias de A y B y determinamos X e Y
            for (int i = 0; i < n; i++) {

                    if (s.charAt(i) == 'A') {
                        winsA++;
                        if(winsA==X){
                            setsA++;
                            winsA=0;
                            winsB=0;
                        }
                    } else {
                        winsB++;
                        if(winsB==X){
                            setsB++;
                            winsA=0;
                            winsB=0;
                        }
                    }
                // Determinamos quién ganó el juego completo

                if (setsA == Y) {
                    System.out.println("Output:");
                    System.out.println("A");
                    break;
                } else if (setsB == Y) {
                    System.out.println("Output:");
                    System.out.println("B");
                    break;
                } else if (i==n-1){
                    System.out.println("Output:");
                    System.out.println("?");
                }



            }

        }

        scanner.close();

    }
}

