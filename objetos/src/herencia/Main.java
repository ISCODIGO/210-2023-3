package herencia;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado(
                "Jose",
                "12342142",
                LocalDate.of(2000, 11, 15),
                "Analista de datos",
                "Contabilidad",
                26000.0
        );
        EmpleadoPorHora emph = new EmpleadoPorHora(
                "Mario",
                "565765",
                LocalDate.of(2000, 11, 15),
                "Supervisor",
                "Taller",
                500.0
        );

        emph.agregarHora(LocalDate.of(2023, 11, 15), 7);
        emph.agregarHora(LocalDate.of(2023, 11, 16), 6);

        //System.out.println(emph);
        //System.out.println(emph.getSalario());

        Persona p = emp;
        Persona p1 = emph;

        System.out.println(p);
        System.out.println(p1);

        Empleado[] empleados = {emp, emph};

        for (Empleado e : empleados) {
            System.out.println(e.getSalario());
        }
    }
}

/*

Object -> Persona -> Empleado




 */