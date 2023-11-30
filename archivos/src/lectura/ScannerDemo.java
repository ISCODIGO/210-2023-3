package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("data.txt"); // ruta relativa
        Scanner sc = new Scanner(archivo);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        File archivo2 = new File("calculo.txt");
        var sc2 = new Scanner(archivo2);

        int val1 = sc2.nextInt();
        int val2 = sc2.nextInt();
        System.out.println(val1 + val2);
    }
}
