package cursoAut;

public class Arepas {

    String nombre;
    String relleno;
    String masa;
    int cantidad;

    public Arepas(String nombre, String relleno, String masa, int cantidad) {
        this.nombre = nombre;
        this.relleno = relleno;
        this.masa = masa;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

        public void saludar() {
            System.out.println("Hola Bienvenido a "+" "+ this.nombre);

        }

        public void sabor(){
            System.out.println("Mi relleno favorito es "+this.relleno);
        }

        public void porcion(){
            System.out.println("me gusta desayunar con "+" "+this.cantidad+" "+ "arepas");
        }
    }

