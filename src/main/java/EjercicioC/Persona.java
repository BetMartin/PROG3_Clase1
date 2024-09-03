package EjercicioC;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String tipoDocumento;
    private long nroDocumento;
    private int telefono;
    private String email;
    private String celular;

    ArrayList<Actividad> actividades = new ArrayList<Actividad>();


    public Persona(String nombre, String tipoDocumento, long nroDocumento, int telefono, String email, String celular, ArrayList<Actividad> actividades) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.celular = celular;
        this.actividades = actividades;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<Actividad> getActividad() {
        return actividades;
    }

    public void setActividad(ArrayList<Actividad> actividad) {
        this.actividades = actividad;
    }

    public void AgregarActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }

    public Persona(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    // C.1 - Total de puntos asignados en todas las actividades
    public double totalPuntosAsignados() {
        double totalPuntos = 0.0;
        for (Actividad actividad : actividades) {
            totalPuntos += actividad.getPuntos();
        }
        return totalPuntos;
    }

    // C.2 - Total de puntos asignados en actividades de un tipo específico
    public double totalPuntosAsignados(int codigo) {
        double totalPuntos = 0.0;
        for (Actividad actividad : actividades) {
            if (actividad.getTipoActividad().getCodigo() == codigo) {
                totalPuntos += actividad.getPuntos();
            }
        }
        return totalPuntos;
    }

    // C.3 - Total de puntos asignados en actividades de un tipo específico en un año específico
    public double totalPuntosAsignados(int codigo, int anio) {
        double totalPuntos = 0.0;
        for (Actividad actividad : actividades) {
            if (actividad.getTipoActividad().getCodigo() == codigo &&
                    actividad.getFechaInicio().getYear() + 1900 == anio) {
                totalPuntos += actividad.getPuntos();
            }
        }
        return totalPuntos;
    }


}

