package Practicas;

import java.util.Scanner;

public class Vectores {



    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int vector []=new int[4];

        vector[0]=2;
        vector[1]=4662;
        vector[2]=2345;
        vector[3]=99992;

        /*String casas[]=new String[7];
        casas[1]="acapulco";

       System.out.println("hola "+vector[0]);
        System.out.println(casas[1]);
        */

        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingresa el valor del vector en el indice "+i);
            vector[i]=scanner.nextInt();
            System.out.println("----------------");

        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("estoy en el indice "+i);
            System.out.println("tengo guardado "+vector[i]);
            System.out.println("----------------");
            
        }
    }


}
