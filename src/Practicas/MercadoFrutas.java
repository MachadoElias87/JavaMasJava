package Practicas;

import java.util.Scanner;

public class MercadoFrutas {


   public static void main(String[] args) {
        String a= "si";
       Scanner scanner= new Scanner(System.in);
       System.out.println("Somos super mercado Exito");
       System.out.println(" Quieres hacer mercado con Nosotros? responde: si o no??");
       String avanzar= scanner.next();

       if(avanzar.equals("si")){

           System.out.println("seguimos avanzando");
           System.out.println("que frutas te gustarian?? pera? manzana? o piña?");
           String fruta= scanner.next();

           switch (fruta){
               case "pera":
                   System.out.println("vale 30 bolivares");
                   break;
               case "manzana":
                   System.out.println("vale 60 pesos");
                   break;
               case "piña":
                   System.out.println("vale 30 pesos");
                   break;
               default:
                   System.out.println("no tenemos esa fruta");
                   break;
           }
           if(fruta.equals("manzana") || fruta.equals("piña") || fruta.equals("pera")){
               System.out.println("si quieres pera marac 1; manzana 2; piña 3");
           }


       }
       else {
           System.out.println("hemos terminado");
       }


    }
}