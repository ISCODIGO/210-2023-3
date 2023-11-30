package escritura;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("ejemplo.txt");

        for (int i = 1; i <= 10; i++) {
            pw.print(i);  // no tiene problemas al emplear digitos
        }

        pw.close();
    }
}
