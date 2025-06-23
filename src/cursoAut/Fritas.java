package cursoAut;

public class Fritas {

    public static void main(String[] args) {
        Arepas ArepasSha;
        ArepasSha = new Arepas("ArepasSha", "Carne Mechada", "Maíz", 2);

        ArepasSha.saludar();
        System.out.println(ArepasSha.getRelleno());
        ArepasSha.setRelleno("Pollo");
        ArepasSha.sabor();

        ArepasSha.porcion();
    }
    }
