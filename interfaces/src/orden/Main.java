package orden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[20];
        Random random = new Random();

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno("cta-" + i, random.nextDouble(0, 101));
        }

        Arrays.sort(alumnos);

        System.out.println(Arrays.toString(alumnos));
    }
}
