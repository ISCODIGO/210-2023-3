import java.io.FileNotFoundException;

public class Main {
    public static void manejadorImpresion(Impresion imp) throws FileNotFoundException {
        imp.imprimir();
    }
    public static void main(String[] args) {
        /*Impresion archivo = new Archivo();
        Impresion consola = new Consola();

        try {
        manejadorImpresion(archivo);
        manejadorImpresion(consola);
        } catch (FileNotFoundException e) {

        }*/

        Calculadora sumar = (double x, double y) -> x + y;
        Calculadora potencia = (double x, double y) -> Math.pow(x, y);

        System.out.println(sumar.calcular(1, 2));

        System.out.println(potencia.calcular(2, 2));
    }
}
