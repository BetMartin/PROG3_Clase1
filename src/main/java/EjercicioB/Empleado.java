package EjercicioB;
import java.util.ArrayList;
import java.util.Calendar;

public class Empleado {
    public String nombre;
    public long cuit;
    public String domicilio;
    public String email;
    public ArrayList<Asistencia> asistencia;
    public ArrayList<Tardanza> tardanzas;
    public RegimenHorario regimen;

    public Empleado(String nombre, long cuit, String domicilio, ArrayList<Asistencia> asistencia, String email, ArrayList<Tardanza> tardanzas, RegimenHorario regimen) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.asistencia = asistencia;
        this.email = email;
        this.tardanzas = tardanzas;
        this.regimen = regimen;
    }

public Empleado(){}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Asistencia> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(ArrayList<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }

    public ArrayList<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(ArrayList<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }

    public RegimenHorario getRegimen() {
        return regimen;
    }

    public void setRegimen(RegimenHorario regimen) {
        this.regimen = regimen;
    }


    public ArrayList<Asistencia> getAsistenciaXMesXAnio(int mes, int anio) {
        ArrayList<Asistencia> asistenciasFiltradas = new ArrayList<>();

        for (Asistencia asistencia : this.asistencia) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(asistencia.getFecha());
            int mesAsistencia = cal.get(Calendar.MONTH) + 1; // Los meses en Calendar comienzan en 0
            int anioAsistencia = cal.get(Calendar.YEAR);

            if (mesAsistencia == mes && anioAsistencia == anio) {
                asistenciasFiltradas.add(asistencia);
            }
        }

        return asistenciasFiltradas;
    }
    public ArrayList<Tardanza> getDiasConTardanza(int mes, int anio) {
        ArrayList<Tardanza> tardanzas = new ArrayList<>();
        ArrayList<Asistencia> asistencias = getAsistenciaXMesXAnio(mes, anio);

        for (Asistencia asistencia : asistencias) {
            RegimenHorario regimen = this.getRegimen();
            int horaIngreso = regimen.getHoraIngreso();
            int minutoIngreso = regimen.getMinutoIngreso();
            int totalMinutosRegimen = horaIngreso * 60 + minutoIngreso;

            int horaAsistencia = asistencia.getHora();
            int minutoAsistencia = asistencia.getMinuto();
            int totalMinutosAsistencia = horaAsistencia * 60 + minutoAsistencia;

            // Verificar si la asistencia supera en más de 15 minutos el horario establecido

            if (totalMinutosAsistencia > totalMinutosRegimen + 15) {
                Tardanza tardanza = new Tardanza(
                        asistencia.getId(),
                        "Tardanza",
                        asistencia.getFecha(),
                        asistencia.getHora(),
                        asistencia.getMinuto(),
                        this
                );
                tardanzas.add(tardanza);
            }
        }

        return tardanzas;
    }

}
