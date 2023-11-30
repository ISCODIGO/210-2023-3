package estatico;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Prueba p = new Prueba();  // constructor por defecto
        p.noEstatico = 12;
        Prueba.estatico = 33;

        System.out.println("Primera revision de p");
        p.revisarAtributos();

        Prueba q = new Prueba();
        q.noEstatico = 45;
        Prueba.estatico = 100;

        System.out.println("Segunda revision de p");
        p.revisarAtributos();
        System.out.println("Primera revision de q");
        q.revisarAtributos();

        p.incrementar();

        System.out.println("Segunda revision de q");
        q.revisarAtributos();
    }
}