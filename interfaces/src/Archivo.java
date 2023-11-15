import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Archivo implements Impresion {
    String mensaje;
    String archivo;
    @Override
    public void imprimir() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(archivo);
        pw.println(mensaje);
    }
}
