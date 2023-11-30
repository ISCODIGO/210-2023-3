package herencia;

import java.time.LocalDate;

public class Empleado extends Persona {
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getArea() {
        return area;
    }

    public Double getSalario() {
        return salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    private String cargo;
    private String area;
    private Double salario;
    private LocalDate fechaIngreso;

    public Empleado(String nombre, String cedula, LocalDate fechaNacimiento, String cargo, String area, Double salario) {
        super(nombre, cedula, fechaNacimiento);
        this.cargo = cargo;
        this.area = area;
        this.salario = salario;
        this.fechaIngreso = LocalDate.now();
    }


    @Override
    public String toString() {
        return String.format("%s (%s - %s)", this.getNombre(), this.cargo, this.area);
    }
}
