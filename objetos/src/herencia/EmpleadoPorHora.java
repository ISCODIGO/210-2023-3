package herencia;

import java.time.LocalDate;
import java.util.ArrayList;

// Object -> Persona -> Empleado -> EmpleadoPorHora
public class EmpleadoPorHora extends Empleado {
    class HoraLaborada {
        public HoraLaborada(LocalDate fecha, int horasLaboradas) {
            this.fecha = fecha;
            this.horasLaboradas = horasLaboradas;
        }

        private LocalDate fecha;
        private int horasLaboradas;

        public double calcularMonto() {
            // costoHora es un atributo privado de EmpleadoPorHora
            return horasLaboradas * costoHora;
        }
    }


    public EmpleadoPorHora(String nombre, String cedula, LocalDate fechaNacimiento, String cargo, String area, double costoHora) {
        super(nombre, cedula, fechaNacimiento, cargo, area, 0.0);
        horaLaboradas = new ArrayList<>();
        this.costoHora = costoHora;
    }

    private double costoHora;
    private ArrayList<HoraLaborada> horaLaboradas;

    @Override
    public Double getSalario() {
        double total = super.getSalario();

        for (HoraLaborada item : horaLaboradas) {
            total += item.calcularMonto();
        }
        return total;
    }

    public void agregarHora(LocalDate fecha, int horas) {
        this.horaLaboradas.add(new HoraLaborada(fecha, horas));
    }
}
