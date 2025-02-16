package Practicas;

public class EjcucionCls {

    public static void main(String[] args) {

        AlumnoC Alumno1= new AlumnoC(12345,"jeremot","machado","matenatica");


        System.out.println("tu nombre es "+Alumno1.nombre);

        Alumno1.setApellido("maracano");
        System.out.println("tu nuevo apellido es "+ Alumno1.getApellido());
        System.out.println("hola gente linda " + Alumno1.nombre);



    }
}
