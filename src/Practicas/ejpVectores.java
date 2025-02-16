package Practicas;

import java.util.Scanner;

public class ejpVectores {


    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);

        String vector[]= new String[4];
        String nombre;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Dime tu nombre "+ i+ " "+vector[i]);
            nombre= Teclado.next();
            System.out.println(" pefecto "+ nombre+ " eres muy bienvenido amigo ");
            vector[i] = nombre;

        }

        System.out.println("todos son bienvenidos ");
        for (int i = 0; i < 4; i++) {
            System.out.println(vector[i]);
        }


    }
}
