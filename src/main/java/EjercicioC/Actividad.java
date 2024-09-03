package EjercicioC;

import java.util.Date;

public class Actividad {
    private TipoActividad tipoActividad;
    private Date fechaInicio;
    private Date fechaFin;
    private String nombre;
    private String descripcion;

    public Actividad(TipoActividad tipoActividad, Date fechaInicio, Date fechaFin, String nombre, String descripcion) {
        this.tipoActividad = tipoActividad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPuntos() {
        return tipoActividad.getPuntosAsignados();
    }
}

