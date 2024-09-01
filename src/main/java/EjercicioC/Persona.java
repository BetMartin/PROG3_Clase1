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

    public Actividad obtenerActividad(int actividad) {
        return this.actividades.get(actividad);
    }

    //C1
    public double totalPuntosAsignados() {
        double total = 0;
        for (Actividad actividad : this.actividades) {
            total += actividad.getTipoActividad().getPuntosAsignados();
        }
        return total;
    }

    //C2
    public double totalPuntosAsignados(int codigo){
        double total = 0;
        for (Actividad actividad : this.actividades) {
            if(actividad.getTipoActividad().getCodigo() == codigo){
                total += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return total;
    }

    //C3
    public double totalPuntosAsignados(int codigo, int anio) {
        double total = 0;
        for (Actividad actividad : this.actividades) {
            if(actividad.getTipoActividad().getCodigo() == codigo && actividad.getFechaInicio().getYear()+2000 >= anio || actividad.getFechaFin().getYear()+2000 <= anio ){
                total += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return total;
    }

    //C4

}

