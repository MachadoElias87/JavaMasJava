package Practicas;

import java.util.Scanner;

public class Repaso {

public static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("adivina la palabra chamo");
        String palabra= scanner.next();

        while (!palabra.equalsIgnoreCase("salir")){

            System.out.println("vuelve a intentar la palabra  chamo");
             palabra= scanner.next();
        }

        System.out.println("adivinaste");


        }
    }

