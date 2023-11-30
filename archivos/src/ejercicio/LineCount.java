package ejercicio;

import lectura.ScannerDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCount {
    public static void ejecutar(String ruta) {
        // Revisar el fichero hacer el conteo de lineas e imprimir:
        // fichero -> numero_de_lineas
        // Lectura de un archivo -> leer las lineas
        // 1. Scanner::nextLine
        // 2. BufferedReader(FileReader)::readLine
        // 3. FileReader::read hallar un '\n'
        int lineas = 0;
        try {
            Scanner sc = new Scanner(new File(ruta));
            while(sc.hasNextLine()) {
                sc.nextLine();
                lineas++;
            }
        } catch (FileNotFoundException e) {
            lineas = -1;
        }
        System.out.printf("Para el archivo: %s hay %d lineas%n", ruta, lineas);
    }
    public static void main(String[] args) {
        for (String arg : args) {
            ejecutar(arg);
        }
    }
}
