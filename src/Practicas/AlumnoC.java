package Practicas;


public class AlumnoC {

    int cedula;String nombre;String apellido;String clase;

    public AlumnoC(int cedula, String nombre, String apellido, String clase) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clase = clase;

    }
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }


    public void saludar(){
        System.out.println();
    }

}
