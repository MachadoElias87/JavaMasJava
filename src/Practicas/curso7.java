package Practicas;

import java.util.Scanner;

public class curso7 {
     public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("dime tu  palabra favorita ");
        String palabra = scanner.nextLine();

        System.out.println("gracias amigo"+" "+ palabra);


        if (palabra.equalsIgnoreCase("perro")){
            System.out.println("eres un campeon");

        } else if (palabra.equalsIgnoreCase("gato")) {
            System.out.println("eres un felino");

        }
        else {
            System.out.println("eres un tontico");
        }

        
    }

}
