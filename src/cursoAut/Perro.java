package cursoAut;

public class Perro {
    //java es un lenguaje fuertemente tipado , declaramos las variables

    String nombre;
    String raza;// string letras
    String color;
    int edad;//numeros

    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void saludar() {
        System.out.println("hola que seas bienvenido "+" "+ this.nombre);

    }

    public void raz(){
        System.out.println("la raza de mi perro es "+this.raza);
    }

    public void ladrar(){
        System.out.println("mi Pero se llama "+" "+this.nombre+" "+ "y ladra bonito ");
    }
}
