package Practicas;

import java.util.Scanner;

public class matrices {

  public static void main(String[] args) {


    int matriz [][]= new int[3][3];

    matriz[0][0]=2;
    matriz[0][1]=23;
    matriz[0][2]=243;
    matriz[1][0]=856773;
    matriz[1][1]=8543;
    matriz[1][2]=853;
    matriz[2][0]=309;
    matriz[2][1]=3;
    matriz[2][2]=8890;
    Scanner Teclado= new Scanner(System.in);

    for (int f = 0; f < 3; f++) {
      for (int c = 0; c < 3; c++) {
        System.out.println("Ingresa el valor de la  "+ f + " columna" + c);
        matriz[f][c]=Teclado.nextInt();
        System.out.println("es de : "+ matriz[f][c]);

      }

    }

    for (int fila = 0; fila < 3; fila++) {
      for (int columna = 0; columna < 3; columna++) {
        System.out.println("El valor de la fila "+ fila+ " columna" +columna);
        System.out.println("es de : "+ matriz[fila][columna]);

      }

    }

  }



}
