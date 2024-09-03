package EjercicioC;

public class TipoActividad {
    private int codigo;
    private String denominacion;
    private double puntosAsignados;

    public TipoActividad(int codigo, String denominacion, double puntosAsignados) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.puntosAsignados = puntosAsignados;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public double getPuntosAsignados() {
        return puntosAsignados;
    }

}