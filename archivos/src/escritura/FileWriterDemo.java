package escritura;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data/fw.txt");
            fw.write("hola mundo\n");
            fw.write(5); // aqui lo leer como un char
            fw.write('\n');
            fw.write("5");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
