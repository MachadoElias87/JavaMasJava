package Avanzado;

import java.util.Scanner;

public class PruebArray {

    public static void main(String[] args) {

        int edad [][]= new int[2][2];
        Scanner teclado= new Scanner(System.in);
        String nombre [][]= new String[2][2];
        Scanner escribir= new Scanner(System.in);

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {

                System.out.println("Dime Tu nombre por favor  ");
                nombre[f][c]= escribir.next();
                System.out.println("Dime Tu edad ");
                edad[f][c]= teclado.nextInt();

            }
        }
        for (int t = 0; t < 2; t++) {
            for (int i = 0; i < 2; i++) {
                System.out.println("tu nombre es "+nombre[t][i]) ;
                System.out.println("tu edad es "+ " "+edad[t][i]);

            }

        }







    }


}
