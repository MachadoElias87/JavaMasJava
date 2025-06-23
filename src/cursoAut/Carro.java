package cursoAut;

public class Carro {

    public static void main(String[] args) {
        Auto Vehiculo;

        Vehiculo= new Auto("Toyota","Toyota Camry","Negro",2000);


        Vehiculo.encender();
        //System.out.println(Vehiculo,getMarca());
        Vehiculo.setMarca("Escarabajo");
        System.out.println(Vehiculo.getMarca());

    }

}
