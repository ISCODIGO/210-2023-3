package lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class FileReaderDemo {
    public static void leerPorCaracter(FileReader fr) throws IOException {
        int lector = 0;
        do {
            lector = fr.read();
            System.out.print((char)lector);
        } while(lector != -1);
    }

    public static void leerPorBuffer(FileReader fr) throws IOException {
        int lector = 0;
        do {
            char[] buffer = new char[100];
            lector = fr.read(buffer);
            System.out.print(Arrays.toString(buffer));
        } while(lector != -1);
    }

    public static void leerPorBufferedReader(FileReader fr) throws IOException {
        BufferedReader buffer = new BufferedReader(fr);
        int lector = 0;
        do {
            lector = buffer.read();
            System.out.print((char)lector);
        } while(lector != -1);
    }

    public static void leerPorBufferedReaderBuffer(FileReader fr) throws IOException {
        int lector = 0;
        BufferedReader bufferedReader = new BufferedReader(fr);
        do {
            char[] buffer = new char[1000];
            lector = bufferedReader.read(buffer);
            System.out.print(Arrays.toString(buffer));
        } while(lector != -1);
    }
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("mbox.txt");
        long instanteInicial = System.currentTimeMillis();
        leerPorBufferedReaderBuffer(fr);
        long instanteFinal = System.currentTimeMillis();
        System.out.printf("%n%nTiempo transcurrido: %d", (instanteFinal-instanteInicial));
    }
}

/*

FileReader::read() -> 18870
FileReader::read(char[]) -> 827
BufferedReader::read() -> 18513
BufferedReader::read(char[]) -> 1053

 */