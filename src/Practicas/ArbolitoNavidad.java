package Practicas;

import java.util.Scanner;

public class ArbolitoNavidad {


    public static void main(String[]args){

        Scanner letras= new Scanner(System.in);
        Scanner numero= new Scanner(System.in);

        System.out.println("dime tu nombre completo");
        String nombre= letras.next();
        System.out.println("Dime tu edad");
        int edad= numero.nextInt();
        System.out.println("cuantas veces quieres que se repita tu nombre??");
        int b= numero.nextInt();
        int e;

        for (e=0;e<=b;e++){

            System.out.println("tu nombre es :"+nombre+" "+e);

        }





    }
}
