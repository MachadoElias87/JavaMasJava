package Avanzado;

import java.util.Scanner;

public class Pruebatecnica {


        public static void main(String[] args) {
            boolean bandera = Boolean.FALSE;
            Scanner teclado= new Scanner(System.in);
            int fila, asiento;
            String respuesta ;


            char asientos[][]= new char[10][10];

            for (int f = 0; f < 10; f++) {
                for (int c = 0; c < 10; c++) {
                    asientos[f][c]='l';

                }

            }


            System.out.println("-------Bienvenidos al sistema de reservas-------");

            while(bandera!=true) {
                System.out.println("ingrese fila y Asiento a reservar");
                System.out.print("Fila (entre 0 y 9)");
                fila=teclado.nextInt();


                System.out.print("ASIENTO (entre 0 y 9)");
                asiento=teclado.nextInt();

                if (asientos[fila][asiento]=='l') {

                    asientos[fila][asiento]='x';
                    System.out.println("El asiento fue reservado correctamente");

                }
                else{
                    System.out.println("El asiento esta ocupado");
                }


                System.out.println("Desea Finalizar la reserva? S= si cualquier tecla no");
                respuesta = teclado.next();

                if (respuesta.equalsIgnoreCase("s")) {
                    bandera= true;

                }

            }
        }

    }

