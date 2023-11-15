package orden;

public class Alumno implements Comparable<Alumno>  {
    public Alumno(String cuenta, double nota) {
        this.cuenta = cuenta;
        this.nota = nota;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    private String cuenta;
    private double nota;


    @Override
    public int compareTo(Alumno o) {
        //return (int)(this.nota * 100 - o.nota * 100);
        return this.cuenta.compareTo(o.cuenta);
    }

    @Override
    public String toString() {
        return String.format("%s = %.2f", this.cuenta, this.nota);
    }
}
