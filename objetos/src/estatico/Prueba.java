package estatico;

public class Prueba {
    public int noEstatico;  // pertenece al objeto
    public static int estatico;  // pertenece a la clase

    public void revisarAtributos() {
        System.out.println(noEstatico);
        System.out.println(estatico);
    }

    public void incrementar() {
        estatico++;
    }
}
