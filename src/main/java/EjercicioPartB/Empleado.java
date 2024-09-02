package EjercicioPartB;

public class Empleado extends Persona {
    
    private int idEmpleado;
    private int nroLegajo;
    private double sueldo;
    
    // Constructor


    public Empleado(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idEmpleado, int nroLegajo, double sueldo) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idEmpleado = idEmpleado;
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public int getNroLegajo() {
        return nroLegajo;
    }
    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EMPLEADO: " +
                super.toString() +
                "\n\tnroLegajo=" + nroLegajo +
                "\n\tsueldo=" + sueldo;
    }
}
