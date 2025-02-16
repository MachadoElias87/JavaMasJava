package Practicas;

import java.util.Scanner;

public class EjMatriz {

    //alumnos 3 notas la cuarta es promedio, solicitar notas por pantalla luego imprimir,
    // y el promedio tambien


    public static void main(String[] args) {
        Double matriz[][]= new Double[4][4];
        Scanner teclado= new Scanner(System.in);
        Double suma= 0.0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingresa la calificacion del Alumno "+f+" "+c );
                matriz[f][c]=teclado.nextDouble();
                suma= suma + matriz[f][c];
            }
             matriz[f][3]=suma/3;
             suma = 0.0;
        }

        for (int f = 0; f < 4; f++) {
            System.out.println("Las calificaciones del Alumnos "+f+ "son : " );
            for (int c = 0; c < 3; c++) {
                System.out.println("Notas n* "+ c +" "+matriz[f][c]);

            }
            System.out.println(" y el promedio de la nota es :"+matriz[f][3]);
        }

}


}
