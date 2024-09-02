package EjercicioPartB;

public class Especialidad {
    private int idEspecialidad;
    private String denominacion;

    // Constructor
    public Especialidad(int idEspecialidad, String denominacion) {
        this.idEspecialidad = idEspecialidad;
        this.denominacion = denominacion;
    }
    
    // Getters y Setters
    public int getIdEspecialidad() {
        return idEspecialidad;
    }
    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return denominacion;
    }
}
