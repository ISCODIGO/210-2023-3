package herencia;

import java.time.LocalDate;

public class Persona {
    public Persona(String nombre, String cedula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    // dd-mm-yyyy LocalDate
    // dd-mm-yyyy HH:MM:SS LocalDateTime

    private String nombre;
    private String cedula;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    private void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    private void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.nombre, this.cedula);
    }
}
