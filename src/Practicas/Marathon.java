package Practicas;

import java.util.Scanner;

public class Marathon {

    public static void main(String[]args){
        Scanner NUMBER= new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        System.out.println("ingresa tu nombre amigo");
        String nombre= letras.next();
        System.out.println(" seas Muy Binevenido amigo " + nombre);
        System.out.println("Dime tu edad amigo");
        int edad= NUMBER.nextInt();
     if(edad==18){
         System.out.println("eres Mayor tienes 18 de edad");

     }
     else {
         if(edad<18){
             System.out.println("eres Menor  de edad");
         }
         else {
             if(edad>18){
                 System.out.println("eres un Anciano ");
             }

         }


     }
     String fruta;
        System.out.println("Que fruta quieres, pera? manzana? ");
         fruta= letras.next();
switch (fruta){

    case "pera":
        System.out.println("muy buena y rica pera");
        System.out.println("con que pagas?? efectivo? 0 trageta??");
        String pago= letras.next();
        if(pago.equals("efectivo")){
            System.out.println("perfecto tienes descuentos");
        }
        else {
            System.out.println("no tenemos para targetas ni otros pagos ");
        }
        break;

    case "manzana":
        System.out.println("no quedan manzanas ");
        break;

    default:
        System.out.println("no quieres es nada asi que vete");
        break;
}






    }
}
