package EjercicioA;

public class Control {
    //Atributos
    private int Id;
    private String denominacion;
    private boolean esObligatorio;
    private EstadoControl estado;

    //Costructores
    public Control() {
    }
    public Control(int id, String denominacion, boolean esObligatorio, EstadoControl estado) {
        this.Id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
        this.estado = estado;
    }

    //Getters y Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public EstadoControl getEstado() {
        return estado;
    }

    public void setEstado(EstadoControl estado) {
        this.estado = estado;
    }

}
