package Practicas;

import java.util.Scanner;



public class funciones {

    public static void saludar(){
            Scanner letras= new Scanner(System.in);

            System.out.println("dime tu nombre completo");
            String nombre= letras.next();
    }
    public static void perrito(){
        
        System.out.println("te amo jesus");

    }
    public static void compras(){
        Scanner numeros= new Scanner(System.in);
        int fruta;
        System.out.println("dime tu fruta favorita");
         fruta= numeros.nextInt();

        switch (fruta){

            case 1:
                System.out.println("esquisita");
                break;
            case 2:
                System.out.println("que rica pera");
                break;

            default:
                System.out.println("no ahi nada para ti");
                break;
        }

    }

    public static void main(String[]args){

        saludar();
        perrito();
        compras();


    }


}

