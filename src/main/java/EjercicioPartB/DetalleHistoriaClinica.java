package EjercicioPartB;

import java.util.Date;

public class DetalleHistoriaClinica {
    
    private int idDetalleHC;
    private Date fechaAtencion;
    private String sintomas;
    private String diagnostico;
    private String observaciones;

    // Constructor
    public DetalleHistoriaClinica(int idDetalleHC, Date fechaAtencion, String sintomas, String diagnostico, String observaciones) {
        this.idDetalleHC = idDetalleHC;
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
    }
    
    // Getters y Setters
    public int getIdDetalleHC() {
        return idDetalleHC;
    }
    public void setIdDetalleHC(int idDetalleHC) {
        this.idDetalleHC = idDetalleHC;
    }
    public Date getFechaAtencion() {
        return fechaAtencion;
    }
    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Detalle "+idDetalleHC +" :"+
                "\n\tfechaAtencion=" + fechaAtencion +
                "\n\tsintomas='" + sintomas +
                "\n\tdiagnostico='" + diagnostico +
                "\n\tobservaciones='" + observaciones;
    }
}
