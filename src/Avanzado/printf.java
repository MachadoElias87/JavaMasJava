package Avanzado;

public class printf {

    // puedes haer salto de linea y escribir mensaje con prinf y valores de variables

    public static void main(String[] args) {
    String zapato= "Rojo";//%s  para String
    int numeroGatos=3;//%d para iniT
        double porcentaje =34.7;// %f
        boolean eres= false;//%b
        //salto de linea %n






        System.out.printf("hola mis zapatos son de color %s buenas noches %n",zapato);
        System.out.printf("tengo un total de %d Gatos aunque no me gustan %n",numeroGatos);
        System.out.printf("esto seria un duoble %f %n",porcentaje);
        System.out.printf("esto seria un boleano %b %n",eres);

    }
}
