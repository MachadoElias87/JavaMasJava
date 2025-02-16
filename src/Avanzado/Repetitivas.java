package Avanzado;

import java.util.Scanner;

public class Repetitivas {

    public static void main (String[]args){


        System.out.println("que numero quieres  empezar a contar???");

        Scanner scanner= new Scanner(System.in);
        int R= scanner.nextInt();
        System.out.println("hasta que numero quieres??");
        int h= scanner.nextInt();
         int c=0;
        while (R<=h){
            System.out.println("estructurra repetitiva  "+ R);
            R++;

        }
        System.out.println("Cuantas veces quieres que se repita??");
        int x=scanner.nextInt();
        for ( int p=0;p<=x;p++){
            System.out.println("somos campeones " +p);
        }
        System.out.println("Adivina el numero secreto");
        int secret=scanner.nextInt();
        while (secret!=7){
            System.out.println("Adivina el numero secreto");
            secret=scanner.nextInt();
        }
        System.out.println("ADIVINASTE");

    }
}
