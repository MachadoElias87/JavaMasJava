package Practicas;

import java.util.Scanner;

public class Cond {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("dime tu promedio");
        String A;

        Double promedio= scanner.nextDouble();

       A= promedio >= 6? "aprobaste":"desaprobado";

        System.out.println("su promedio es  "+promedio+ "y estas "+ A);


        System.out.println("dime tu sueldo");
        int sueldo=scanner.nextInt();
        int mult;
        int cont=0;
        mult= sueldo<=8? sueldo/4:sueldo*124;

        System.out.println("tu sueldo es  :"+mult);

        System.out.println("A divina el numero Secreto");
        int secret= scanner.nextInt();

        while (secret!=7){

            System.out.println("vuelve a intentar");
            System.out.println("A divina el numero Secreto");
            secret= scanner.nextInt();






        }

        System.out.println("adivinaste ");

        for (int a=0;a<=10;a++){
            System.out.println("la vida es bella "+a);

        }


    }
}
