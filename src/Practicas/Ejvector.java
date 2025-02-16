package Practicas;

import java.util.Scanner;

public class Ejvector {

    public static void main(String[] args) {
        int vector[] = new int[15];
        Scanner Teclado = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            System.out.println("Añade e numero al vector " + i);
            vector[i] = Teclado.nextInt();

        }

        int cont = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                cont = cont + 1;

            }

        }

        System.out.println("tenemos la cantidadd de  " + cont + "en nuestro sistema");


    } }