public class Consola implements Impresion {
    String mensaje;
    @Override
    public void imprimir() {
        System.out.println(mensaje);
    }
}
